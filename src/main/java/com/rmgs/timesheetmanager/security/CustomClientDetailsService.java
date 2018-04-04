package com.rmgs.timesheetmanager.security;

import com.rmgs.timesheetmanager.models.User;
import com.rmgs.timesheetmanager.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CustomClientDetailsService implements UserDetailsService {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Implemented Methods">
    User createUser(User user) {
        // encrypt the plain-text password
        user.setMagic(passwordEncoder.encode(user.getMagic()));
        //...
        return userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email);
        if (user != null) {
            return new CustomClientDetails(user);
        } else {
            throw new UsernameNotFoundException("Invalid Username or Password");
        }
    }
    // </editor-fold>

}
