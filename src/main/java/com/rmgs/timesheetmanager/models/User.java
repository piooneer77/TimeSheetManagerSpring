package com.rmgs.timesheetmanager.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table( name = "usertable" )
public class User {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String name;
    private String email;
    private String magic;
    private LocalDateTime createdAt;
    private Boolean isActive;
    private Boolean isDeleted;
    private Boolean isSuspended;
    @JsonIgnoreProperties("user")
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Project> linkedProjects = new ArrayList<Project>();
    @JsonIgnoreProperties("user")
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<TimeSheetEntry> timeSheetEntries = new ArrayList<TimeSheetEntry>();
    @JsonIgnoreProperties("user")
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<TimeSheetExportHistory> timeSheetExportHistories = new ArrayList<TimeSheetExportHistory>();
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public User() {
    }

    public User(User user){
        this.Id = user.Id;
        this.name = user.name;
        this.email = user.email;
        this.magic = user.magic;
        this.createdAt = user.createdAt;
        this.isActive = user.isActive;
        this.isDeleted = user.isDeleted;
        this.isSuspended = user.isSuspended;
        this.linkedProjects = user.linkedProjects;
        this.timeSheetEntries = user.timeSheetEntries;
        this.timeSheetExportHistories = user.timeSheetExportHistories;
    }

    public User(String name, String email, String magic, LocalDateTime createdAt, Boolean isActive, Boolean isDeleted, Boolean isSuspended, List<Project> linkedProjects, List<TimeSheetEntry> timeSheetEntries, List<TimeSheetExportHistory> timeSheetExportHistories) {
        this.name = name;
        this.email = email;
        this.magic = magic;
        this.createdAt = createdAt;
        this.isActive = isActive;
        this.isDeleted = isDeleted;
        this.isSuspended = isSuspended;
        this.linkedProjects = linkedProjects;
        this.timeSheetEntries = timeSheetEntries;
        this.timeSheetExportHistories = timeSheetExportHistories;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public Integer getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMagic() {
        return magic;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public Boolean getActive() {
        return isActive;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public Boolean getSuspended() {
        return isSuspended;
    }

    public List<Project> getLinkedProjects() {
        return linkedProjects;
    }

    public List<TimeSheetEntry> getTimeSheetEntries() {
        return timeSheetEntries;
    }

    public List<TimeSheetExportHistory> getTimeSheetExportHistories() {
        return timeSheetExportHistories;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMagic(String magic) {
        this.magic = magic;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public void setSuspended(Boolean suspended) {
        isSuspended = suspended;
    }

    public void setLinkedProjects(List<Project> linkedProjects) {
        this.linkedProjects = linkedProjects;
    }

    public void setTimeSheetEntries(List<TimeSheetEntry> timeSheetEntries) {
        this.timeSheetEntries = timeSheetEntries;
    }

    public void setTimeSheetExportHistories(List<TimeSheetExportHistory> timeSheetExportHistories) {
        this.timeSheetExportHistories = timeSheetExportHistories;
    }

    // </editor-fold>

}
