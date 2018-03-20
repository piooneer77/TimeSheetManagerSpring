package com.rmgs.timesheetmanager.repositories;

import com.rmgs.timesheetmanager.models.ProjectTimelineHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectTimelineHistoryRepository extends JpaRepository<ProjectTimelineHistory, Integer>{
}
