package com.rmgs.timesheetmanager.business;

import com.rmgs.timesheetmanager.models.Project;
import org.springframework.stereotype.Component;

@Component
public class ProjectBusiness extends GenericBusiness<Project> {

    // <editor-fold defaultstate="collapsed" desc="Properties">

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Public Methods">
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
