package com.rmgs.timesheetmanager.repositories;

import com.rmgs.timesheetmanager.models.TimeSheetExportHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TimeSheetExportHistoryRepository extends JpaRepository<TimeSheetExportHistory, Integer>, BaseRepository<TimeSheetExportHistory>{

    // <editor-fold defaultstate="collapsed" desc="Implemented Methods">
    @Override
    default List<TimeSheetExportHistory> getAll() {
        return findAll();
    }

    @Override
    default TimeSheetExportHistory GetById(Integer Id) {
        return findById(Id).get();
    }

    @Override
    default TimeSheetExportHistory Create(TimeSheetExportHistory timeSheetExportHistory) {
        return save(timeSheetExportHistory);
    }

    @Override
    default TimeSheetExportHistory Update(TimeSheetExportHistory timeSheetExportHistory) {
        return save(timeSheetExportHistory);
    }

    @Override
    default void Delete(TimeSheetExportHistory timeSheetExportHistory) {
        delete(timeSheetExportHistory);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Custom Query Methods">

    // </editor-fold>

}
