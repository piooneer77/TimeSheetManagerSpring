package com.rmgs.timesheetmanager.repositories;

import com.rmgs.timesheetmanager.models.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends GenericRepository<User> {

    // <editor-fold defaultstate="collapsed" desc="Implemented Methods">

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Custom Query Methods">
    User findByEmailAndMagic(String email, String magic);

    User findByEmail(String email);
    // </editor-fold>

}
