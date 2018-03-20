package com.rmgs.timesheetmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeSheetExportHistoryRepository extends JpaRepository<TimeSheetExportHistoryRepository, Integer>{
}
