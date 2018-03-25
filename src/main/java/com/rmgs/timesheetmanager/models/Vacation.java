package com.rmgs.timesheetmanager.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table( name = "vacation_table" )
public class Vacation {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String name;
    private LocalDate startFrom;
    private LocalDate endsOn;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public Vacation() {
    }

    public Vacation(String name, LocalDate startFrom, LocalDate endsOn) {
        this.name = name;
        this.startFrom = startFrom;
        this.endsOn = endsOn;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Getters">
    public Integer getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getStartFrom() {
        return startFrom;
    }

    public LocalDate getEndsOn() {
        return endsOn;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setName(String name) {
        this.name = name;
    }

    public void setStartFrom(LocalDate startFrom) {
        this.startFrom = startFrom;
    }

    public void setEndsOn(LocalDate endsOn) {
        this.endsOn = endsOn;
    }
    // </editor-fold>

}
