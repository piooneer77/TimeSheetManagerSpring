package com.rmgs.timesheetmanager.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table( name = "timesheetentry_table" )
public class TimeSheetEntry {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private Float hoursLogged;
    private LocalDateTime dateTime;
    @JsonIgnoreProperties("timeSheetEntries")
    @ManyToOne(fetch = FetchType.LAZY)
    private Project project;
    @JsonIgnoreProperties("timeSheetEntries")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public TimeSheetEntry() {
    }

    public TimeSheetEntry(Float hoursLogged, LocalDateTime dateTime, Project project, User user) {
        this.hoursLogged = hoursLogged;
        this.dateTime = dateTime;
        this.project = project;
        this.user = user;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public Integer getId() {
        return Id;
    }

    public Float getHoursLogged() {
        return hoursLogged;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Project getProject() {
        return project;
    }

    public User getUser() {
        return user;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setHoursLogged(Float hoursLogged) {
        this.hoursLogged = hoursLogged;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public void setUser(User user) {
        this.user = user;
    }
    // </editor-fold>

}
