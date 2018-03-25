package com.rmgs.timesheetmanager.business;

import com.rmgs.timesheetmanager.models.TimeSheetExportHistory;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class TimeSheetExportHistoryBusiness extends GenericBusiness<TimeSheetExportHistory>{

    // <editor-fold defaultstate="collapsed" desc="Properties">

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Public Methods">
    public List<TimeSheetExportHistory> GetByUserId(Integer Id){
        return genericRepository
                .findAll()
                .stream()
                .filter( x -> x.getUser().getId() == Id)
                .collect(Collectors.toList());
    }
    // </editor-fold>

}
