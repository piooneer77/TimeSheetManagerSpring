package com.rmgs.timesheetmanager.repositories;

import com.rmgs.timesheetmanager.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
