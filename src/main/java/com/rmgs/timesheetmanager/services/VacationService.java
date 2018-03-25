package com.rmgs.timesheetmanager.services;

import com.rmgs.timesheetmanager.business.VacationBusiness;
import com.rmgs.timesheetmanager.models.Vacation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(value = "/vacation")
public class VacationService {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Autowired
    private VacationBusiness vacationBusiness;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Get Methods">
    @GetMapping(value = "getall")
    public ResponseEntity<List<Vacation>> GetAll(){
        return new ResponseEntity<List<Vacation>>(vacationBusiness.getAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/getbetweendates")
    public ResponseEntity<List<Vacation>> GetBetweenDates(LocalDate fromDate, LocalDate toDate){
        return new ResponseEntity<List<Vacation>>(vacationBusiness.GetWithDateFromTo(fromDate, toDate), HttpStatus.OK);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Post Methods">
    @PostMapping(value = "/create")
    public ResponseEntity<Vacation> Create(@RequestBody Vacation vacation){
        return new ResponseEntity<Vacation>(vacationBusiness.Create(vacation), HttpStatus.CREATED);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Delete Methods">
    @DeleteMapping(value = "/delete/{Id}")
    public ResponseEntity Delete(Integer Id){
        vacationBusiness.Delete(Id);
        return new ResponseEntity(HttpStatus.OK);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Private Methods">

    // </editor-fold>

}
