package com.rmgs.timesheetmanager.repositories;

import java.util.List;

public interface BaseRepository<Generic> {

    // <editor-fold defaultstate="collapsed" desc="Methods">
    List<Generic> getAll();

    Generic GetById(Integer Id);

    Generic Create(Generic generic);

    Generic Update(Generic generic);

    void Delete(Generic generic);
    // </editor-fold>

}
