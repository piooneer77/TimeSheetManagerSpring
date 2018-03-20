package com.rmgs.timesheetmanager.repositories;

import com.rmgs.timesheetmanager.models.ProjectTimelineHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProjectTimelineHistoryRepository extends JpaRepository<ProjectTimelineHistory, Integer>, BaseRepository<ProjectTimelineHistory>{

    // <editor-fold defaultstate="collapsed" desc="Implemented Methods">
    @Override
    default List<ProjectTimelineHistory> getAll() {
        return findAll();
    }

    @Override
    default ProjectTimelineHistory GetById(Integer Id) {
        return findById(Id).get();
    }

    @Override
    default ProjectTimelineHistory Create(ProjectTimelineHistory projectTimelineHistory) {
        return save(projectTimelineHistory);
    }

    @Override
    default ProjectTimelineHistory Update(ProjectTimelineHistory projectTimelineHistory) {
        return save(projectTimelineHistory);
    }

    @Override
    default void Delete(ProjectTimelineHistory projectTimelineHistory) {
        delete(projectTimelineHistory);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Custom Query Methods">

    // </editor-fold>

}
