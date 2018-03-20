package com.rmgs.timesheetmanager.repositories;

import com.rmgs.timesheetmanager.models.SavedFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SavedFileRepository extends JpaRepository<SavedFile, Integer>{
}
