package com.rmgs.timesheetmanager.repositories;

import com.rmgs.timesheetmanager.models.SavedFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SavedFileRepository extends JpaRepository<SavedFile, Integer>, BaseRepository<SavedFile>{

    // <editor-fold defaultstate="collapsed" desc="Implemented Methods">
    @Override
    default List<SavedFile> getAll() {
        return findAll();
    }

    @Override
    default SavedFile GetById(Integer Id) {
        return findById(Id).get();
    }

    @Override
    default SavedFile Create(SavedFile savedFile) {
        return save(savedFile);
    }

    @Override
    default SavedFile Update(SavedFile savedFile) {
        return save(savedFile);
    }

    @Override
    default void Delete(SavedFile savedFile) {
        delete(savedFile);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Custom Query Methods">

    // </editor-fold>

}
