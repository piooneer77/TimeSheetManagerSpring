package com.rmgs.timesheetmanager.services;

import com.rmgs.timesheetmanager.business.TimeSheetExportHistoryBusiness;
import com.rmgs.timesheetmanager.models.TimeSheetExportHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/timesheetexporthistory")
public class TimeSheetExportHistoryService {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Autowired
    private TimeSheetExportHistoryBusiness timeSheetExportHistoryBusiness;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Post Methods">

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Get Methods">
    @GetMapping(value = "/frouserid/{Id}")
    public ResponseEntity<List<TimeSheetExportHistory>> GetForUserId(Integer Id){
        return new ResponseEntity<List<TimeSheetExportHistory>>(timeSheetExportHistoryBusiness.GetByUserId(Id), HttpStatus.OK);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Private Methods">

    // </editor-fold>

}
