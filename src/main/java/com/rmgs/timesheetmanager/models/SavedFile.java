package com.rmgs.timesheetmanager.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.File;

@Entity
@Table( name = "savedfile_table" )
public class SavedFile {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Id
    private Integer Id;
    private File fileInfo;
    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private TimeSheetExportHistory timeSheetExportHistory;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public SavedFile() {
    }

    public SavedFile(File fileInfo, TimeSheetExportHistory timeSheetExportHistory) {
        this.fileInfo = fileInfo;
        this.timeSheetExportHistory = timeSheetExportHistory;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public Integer getId() {
        return Id;
    }

    public File getFileInfo() {
        return fileInfo;
    }

    public TimeSheetExportHistory getTimeSheetExportHistory() {
        return timeSheetExportHistory;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setFileInfo(File fileInfo) {
        this.fileInfo = fileInfo;
    }

    public void setTimeSheetExportHistory(TimeSheetExportHistory timeSheetExportHistory) {
        this.timeSheetExportHistory = timeSheetExportHistory;
    }
    // </editor-fold>

}
