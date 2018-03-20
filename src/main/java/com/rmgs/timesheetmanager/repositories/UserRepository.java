package com.rmgs.timesheetmanager.repositories;

import com.rmgs.timesheetmanager.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>, BaseRepository<User>{

    // <editor-fold defaultstate="collapsed" desc="Implemented Methods">
    @Override
    default List<User> getAll() {
        return findAll();
    }

    @Override
    default User GetById(Integer Id) {
        return findById(Id).get();
    }

    @Override
    default User Create(User user) {
        return save(user);
    }

    @Override
    default User Update(User user) {
        return save(user);
    }

    @Override
    default void Delete(User user) {
        delete(user);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Custom Query Methods">

    // </editor-fold>

}
