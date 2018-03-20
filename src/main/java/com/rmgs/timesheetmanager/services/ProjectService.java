package com.rmgs.timesheetmanager.services;

import com.rmgs.timesheetmanager.business.ProjectBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/project")
public class ProjectService {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Autowired
    private ProjectBusiness projectBusiness;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Post Methods">

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Get Methods">

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Private Methods">

    // </editor-fold>

}
