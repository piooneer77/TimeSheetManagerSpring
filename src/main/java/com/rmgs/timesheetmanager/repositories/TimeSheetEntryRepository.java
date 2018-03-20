package com.rmgs.timesheetmanager.repositories;

import com.rmgs.timesheetmanager.models.TimeSheetEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeSheetEntryRepository extends JpaRepository<TimeSheetEntry, Integer>{
}
