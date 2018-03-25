package com.rmgs.timesheetmanager.services;

import com.rmgs.timesheetmanager.business.ProjectBusiness;
import com.rmgs.timesheetmanager.models.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/project")
public class ProjectService {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Autowired
    private ProjectBusiness projectBusiness;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Post Methods">
    @PostMapping(value = "/create")
    public ResponseEntity<Project> Create(@RequestBody Project project){
        return new ResponseEntity<Project>(projectBusiness.Create(project), HttpStatus.CREATED);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Put Methods">
    @PutMapping(value = "/update")
    public ResponseEntity<Project> Update(@RequestBody Project project){
        return new ResponseEntity<Project>(projectBusiness.Update(project), HttpStatus.OK);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Delete Methods">
    @DeleteMapping(value = "/delete/{Id}")
    public ResponseEntity Delete(@PathVariable("Id") Integer Id){
        projectBusiness.Delete(Id);
        return new ResponseEntity(HttpStatus.OK);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Patch Methods">
    @PatchMapping(value = "/disable/{Id}")
    public ResponseEntity<Project> Disable(@PathVariable("Id") Integer Id){
        return new ResponseEntity<Project>(projectBusiness.Disable(Id), HttpStatus.OK);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Private Methods">

    // </editor-fold>

}
