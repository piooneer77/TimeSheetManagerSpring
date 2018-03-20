package com.rmgs.timesheetmanager.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table( name = "timesheetexporthistory_table" )
public class TimeSheetExportHistory {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private LocalDateTime createdAt;
    private LocalDateTime exportedInfoStartDate;
    private LocalDateTime exportedInfoEndDate;
    @JsonIgnoreProperties("timeSheetExportHistories")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
    @OneToOne(fetch = FetchType.LAZY)
    private SavedFile savedFile;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public TimeSheetExportHistory() {
    }

    public TimeSheetExportHistory(LocalDateTime createdAt, LocalDateTime exportedInfoStartDate, LocalDateTime exportedInfoEndDate, User user, SavedFile savedFile) {
        this.createdAt = createdAt;
        this.exportedInfoStartDate = exportedInfoStartDate;
        this.exportedInfoEndDate = exportedInfoEndDate;
        this.user = user;
        this.savedFile = savedFile;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public Integer getId() {
        return Id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getExportedInfoStartDate() {
        return exportedInfoStartDate;
    }

    public LocalDateTime getExportedInfoEndDate() {
        return exportedInfoEndDate;
    }

    public User getUser() {
        return user;
    }

    public SavedFile getSavedFile() {
        return savedFile;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setExportedInfoStartDate(LocalDateTime exportedInfoStartDate) {
        this.exportedInfoStartDate = exportedInfoStartDate;
    }

    public void setExportedInfoEndDate(LocalDateTime exportedInfoEndDate) {
        this.exportedInfoEndDate = exportedInfoEndDate;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setSavedFile(SavedFile savedFile) {
        this.savedFile = savedFile;
    }
    // </editor-fold>

}
