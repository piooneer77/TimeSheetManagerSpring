package com.rmgs.timesheetmanager.business;

import com.rmgs.timesheetmanager.models.TimeSheetEntry;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class TimeSheetEntryBusiness extends GenericBusiness<TimeSheetEntry>{

    // <editor-fold defaultstate="collapsed" desc="Properties">

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Public Methods">
    public List<TimeSheetEntry> GetByUserIdAndDateFromTo(Integer userId, LocalDate from, LocalDate To){
        long bigDate = ChronoUnit.DAYS.between(from, LocalDateTime.now());
        long smallDate = ChronoUnit.DAYS.between(To, LocalDateTime.now());
        return genericRepository
                .findAll()
                .stream()
                .filter( x -> x.getUser().getId() == userId &&
                        ChronoUnit.DAYS.between(x.getDateTime(), LocalDateTime.now()) >= smallDate &&
                        ChronoUnit.DAYS.between(x.getDateTime(), LocalDateTime.now()) <= bigDate)
                .collect(Collectors.toList());
    }
    // </editor-fold>

}
