package com.rmgs.timesheetmanager.business;

import com.rmgs.timesheetmanager.models.Project;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProjectBusiness extends GenericBusiness<Project> {

    // <editor-fold defaultstate="collapsed" desc="Properties">

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Public Methods">
    public List<Project> GetForUserId(Integer Id){
        return genericRepository
                .findAll()
                .stream()
                .filter( x -> x.getUser().getId() == Id)
                .collect(Collectors.toList());
    }

    public List<Project> GetActive(){
        return genericRepository
                .findAll()
                .stream()
                .filter( x -> x.getActive())
                .collect(Collectors.toList());
    }

//    public List<Project> GetForUserIdWithDates(Integer Id, LocalDate fromDate, LocalDate toDate){
//        long bigDate = ChronoUnit.DAYS.between(fromDate, LocalDateTime.now());
//        long smallDate = ChronoUnit.DAYS.between(toDate, LocalDateTime.now());
//        return genericRepository
//                .findAll()
//                .stream()
//                .filter( x -> x.getUser().getId() == Id &&
//                        ChronoUnit.DAYS.between(x, LocalDateTime.now()) >= smallDate &&
//                        ChronoUnit.DAYS.between(x.getEndsOn(), LocalDateTime.now()) <= bigDate)
//                .collect(Collectors.toList());
//    }

    public Project Disable(Integer Id){
        Project project = this.GetById(Id);
        return this.Deactivate(project);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Private Methods">
    private Project Deactivate(Project project){
        project.setActive(false);
        return project;
    }
    // </editor-fold>

}
