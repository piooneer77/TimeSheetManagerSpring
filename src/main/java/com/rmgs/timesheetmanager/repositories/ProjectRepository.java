package com.rmgs.timesheetmanager.repositories;

import com.rmgs.timesheetmanager.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer>, BaseRepository<Project>{

    // <editor-fold defaultstate="collapsed" desc="Implemented Methods">
    @Override
    default List<Project> getAll() {
        return findAll();
    }

    @Override
    default Project GetById(Integer Id) {
        return findById(Id).get();
    }

    @Override
    default Project Create(Project project) {
        return save(project);
    }

    @Override
    default Project Update(Project project) {
        return save(project);
    }

    @Override
    default void Delete(Project project) {
        delete(project);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Custom Query Methods">

    // </editor-fold>

}
