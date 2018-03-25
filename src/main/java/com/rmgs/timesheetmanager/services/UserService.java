package com.rmgs.timesheetmanager.services;

import com.rmgs.timesheetmanager.business.UserBusiness;
import com.rmgs.timesheetmanager.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserService {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Autowired
    private UserBusiness userBusiness;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Get Methods">
    @GetMapping(value = "/getall")
    public ResponseEntity<List<User>> getAll(){
        return new ResponseEntity<List<User>>(userBusiness.getAll(), HttpStatus.OK);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Post Methods">
    @PostMapping(value = "login/{user}/{magic}")
    public ResponseEntity<User> Login(@PathVariable String user, @PathVariable String magic){
        return new ResponseEntity<User>(userBusiness.Login(user, magic), HttpStatus.OK);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<User> Create(@RequestBody User user){
        return new ResponseEntity<User>(userBusiness.Create(user), HttpStatus.CREATED);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Put Methods">
    @PutMapping(value = "/update")
    public ResponseEntity<User> Update(@RequestBody User user){
        return new ResponseEntity<User>(userBusiness.Update(user), HttpStatus.OK);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Delete Methods">
    @DeleteMapping(value = "/delete/{Id}")
    public ResponseEntity Delete(@PathVariable Integer Id){
        userBusiness.Delete(Id);
        return new ResponseEntity(HttpStatus.OK);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Patch Methods">
    @PatchMapping(value = "/disable/{Id}")
    public ResponseEntity<User> Disable(@PathVariable("Id") Integer Id){
        return new ResponseEntity<User>(userBusiness.Disable(Id), HttpStatus.OK);
    }

    @PatchMapping(value = "/resetpassword/{Id}")
    public ResponseEntity<User> ResetPassword(Integer Id){
        return new ResponseEntity<User>(userBusiness.ResetPassword(Id), HttpStatus.OK);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Private Methods">

    // </editor-fold>

}
