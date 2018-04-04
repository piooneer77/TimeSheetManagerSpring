package com.rmgs.timesheetmanager.business;

import com.rmgs.timesheetmanager.Encryption.Encryption;
import com.rmgs.timesheetmanager.models.User;
import com.rmgs.timesheetmanager.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@Component
public class UserBusiness {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Autowired
    private UserRepository userRepository;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Public Methods">
    public User Login(String user, String magic){
        return userRepository.findByEmailAndMagic(user, magic);
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User Create(User user) {
        return userRepository.save(user);
    }

    public User Update(User user) {
        return userRepository.save(user);
    }

    public void Delete(Integer id) {
        userRepository.delete(id);
    }

    public User ResetPassword(Integer Id){
        User user = userRepository.findOne(Id);
        try {
            this.setPasswordToDefault(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    public User Disable(Integer Id){
        User user = userRepository.findOne(Id);
        return this.Deactivate(user);
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Private Methods">
    private User Deactivate(User user){
        user.setActive(false);
        return user;
    }

    private User setPasswordToDefault(User user) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        user.setMagic(Encryption.encryptPassword("default"));
        return user;
    }
    // </editor-fold>

}
