package com.rmgs.timesheetmanager.services;

import com.rmgs.timesheetmanager.business.TimeSheetEntryBusiness;
import com.rmgs.timesheetmanager.models.TimeSheetEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(value = "/timesheetentry")
public class TimeSheetEntryService {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Autowired
    private TimeSheetEntryBusiness timeSheetEntryBusiness;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Post Methods">

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Get Methods">
    @GetMapping(value = "/for/{Id}/withdates", produces = {"application/json"}, consumes = {"application/json"})
    public ResponseEntity<List<TimeSheetEntry>> GetAllForIdWithDates(@PathVariable Integer Id, @RequestBody LocalDate fromDate, @RequestBody LocalDate toDate){
        return new ResponseEntity<List<TimeSheetEntry>>(timeSheetEntryBusiness.GetByUserIdAndDateFromTo(Id, fromDate, toDate), HttpStatus.OK);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Private Methods">

    // </editor-fold>

}
