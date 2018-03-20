package com.rmgs.timesheetmanager.repositories;

import com.rmgs.timesheetmanager.models.TimeSheetEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TimeSheetEntryRepository extends JpaRepository<TimeSheetEntry, Integer>, BaseRepository<TimeSheetEntry>{

    // <editor-fold defaultstate="collapsed" desc="Implemented Methods">
    @Override
    default List<TimeSheetEntry> getAll() {
        return findAll();
    }

    @Override
    default TimeSheetEntry GetById(Integer Id) {
        return findById(Id).get();
    }

    @Override
    default TimeSheetEntry Create(TimeSheetEntry timeSheetEntry) {
        return save(timeSheetEntry);
    }

    @Override
    default TimeSheetEntry Update(TimeSheetEntry timeSheetEntry) {
        return save(timeSheetEntry);
    }

    @Override
    default void Delete(TimeSheetEntry timeSheetEntry) {
        delete(timeSheetEntry);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Custom Query Methods">

    // </editor-fold>

}
