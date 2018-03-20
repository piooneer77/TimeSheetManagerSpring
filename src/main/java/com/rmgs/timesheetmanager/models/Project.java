package com.rmgs.timesheetmanager.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import java.util.List;

@Entity
@Table( name = "project_table" )
public class Project {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String name;
    private String projectManagerName;
    private Boolean isActive;
    @JsonIgnoreProperties("linkedProjects")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
    @JsonIgnoreProperties("project")
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "project")
    private List<ProjectTimelineHistory> projectTimelineHistories;
    @JsonIgnoreProperties("project")
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "project")
    private List<TimeSheetEntry> timeSheetEntries;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public Project() {
    }

    public Project(String name, String projectManagerName, Boolean isActive, User user, List<ProjectTimelineHistory> projectTimelineHistories, List<TimeSheetEntry> timeSheetEntries) {
        this.name = name;
        this.projectManagerName = projectManagerName;
        this.isActive = isActive;
        this.user = user;
        this.projectTimelineHistories = projectTimelineHistories;
        this.timeSheetEntries = timeSheetEntries;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public Integer getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getProjectManagerName() {
        return projectManagerName;
    }

    public Boolean getActive() {
        return isActive;
    }

    public User getUser() {
        return user;
    }

    public List<ProjectTimelineHistory> getProjectTimelineHistories() {
        return projectTimelineHistories;
    }

    public List<TimeSheetEntry> getTimeSheetEntries() {
        return timeSheetEntries;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setName(String name) {
        this.name = name;
    }

    public void setProjectManagerName(String projectManagerName) {
        this.projectManagerName = projectManagerName;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setProjectTimelineHistories(List<ProjectTimelineHistory> projectTimelineHistories) {
        this.projectTimelineHistories = projectTimelineHistories;
    }

    public void setTimeSheetEntries(List<TimeSheetEntry> timeSheetEntries) {
        this.timeSheetEntries = timeSheetEntries;
    }
    // </editor-fold>

}
