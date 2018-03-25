package com.rmgs.timesheetmanager.business;

import com.rmgs.timesheetmanager.models.Vacation;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class VacationBusiness extends GenericBusiness<Vacation> {

    // <editor-fold defaultstate="collapsed" desc="Properties">

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Public Methods">
    public List<Vacation> GetWithDateFromTo(LocalDate from, LocalDate To){
        long bigDate = ChronoUnit.DAYS.between(from, LocalDateTime.now());
        long smallDate = ChronoUnit.DAYS.between(To, LocalDateTime.now());
        return genericRepository
                .findAll()
                .stream()
                .filter( x -> ChronoUnit.DAYS.between(x.getStartFrom(), LocalDateTime.now()) >= smallDate &&
                        ChronoUnit.DAYS.between(x.getEndsOn(), LocalDateTime.now()) <= bigDate)
                .collect(Collectors.toList());
    }
    // </editor-fold>

}
