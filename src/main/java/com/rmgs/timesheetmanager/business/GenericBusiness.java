package com.rmgs.timesheetmanager.business;

import com.rmgs.timesheetmanager.repositories.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class GenericBusiness<Generic> {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Autowired
    private GenericRepository<Generic> genericRepository;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Public Methods">
    public List<Generic> getAll(){
        return genericRepository.findAll();
    }

    public Generic GetById(Integer Id){
        return genericRepository.findById(Id).get();
    }

    public Generic Create(Generic model){
        return genericRepository.save(model);
    }

    public Generic Update(Generic model){
        return genericRepository.save(model);
    }

    public void Delete(Integer Id){
        genericRepository.deleteById(Id);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Private Methods">

    // </editor-fold>
}
