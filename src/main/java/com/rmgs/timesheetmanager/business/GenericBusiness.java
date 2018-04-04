package com.rmgs.timesheetmanager.business;

import com.rmgs.timesheetmanager.repositories.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class GenericBusiness<Generic> {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Autowired
    public GenericRepository<Generic> genericRepository;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Public Methods">
    public List<Generic> getAll(){
        return genericRepository.findAll();
    }

    public Generic GetById(Integer Id){
        return genericRepository.findOne(Id);
    }

    public Generic Create(Generic model){
        return genericRepository.save(model);
    }

    public Generic Update(Generic model){
        return genericRepository.save(model);
    }

    public void Delete(Integer Id){
        genericRepository.delete(Id);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Private Methods">

    // </editor-fold>
}
