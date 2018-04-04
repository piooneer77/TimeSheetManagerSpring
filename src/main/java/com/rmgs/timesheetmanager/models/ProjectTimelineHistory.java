package com.rmgs.timesheetmanager.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table( name = "projecttimelinehistorytable" )
public class ProjectTimelineHistory {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private LocalDateTime startedFrom;
    private LocalDateTime stoppedOn;
    @JsonIgnoreProperties("projectTimelineHistories")
    @ManyToOne(fetch = FetchType.LAZY)
    private Project project;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public ProjectTimelineHistory() {
    }

    public ProjectTimelineHistory(LocalDateTime startedFrom, LocalDateTime stoppedOn, Project project) {
        this.startedFrom = startedFrom;
        this.stoppedOn = stoppedOn;
        this.project = project;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public Integer getId() {
        return Id;
    }

    public LocalDateTime getStartedFrom() {
        return startedFrom;
    }

    public LocalDateTime getStoppedOn() {
        return stoppedOn;
    }

    public Project getProject() {
        return project;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setStartedFrom(LocalDateTime startedFrom) {
        this.startedFrom = startedFrom;
    }

    public void setStoppedOn(LocalDateTime stoppedOn) {
        this.stoppedOn = stoppedOn;
    }

    public void setProject(Project project) {
        this.project = project;
    }
    // </editor-fold>

}
