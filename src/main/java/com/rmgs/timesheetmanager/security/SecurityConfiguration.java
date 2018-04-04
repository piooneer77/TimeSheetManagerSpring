package com.rmgs.timesheetmanager.security;

import com.rmgs.timesheetmanager.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    // <editor-fold defaultstate="collapsed" desc="Properties">
    @Autowired
    private CustomClientDetailsService customClientDetailsService;
    @Autowired
    PasswordEncoder passwordEncoder;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Implemented Methods">
    @Override
    @Autowired
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customClientDetailsService);
//        .passwordEncoder(passwordEncoder);
    }

//    @Bean
//    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
//        http.authorizeExchange().anyExchange().permitAll();
//        return http.build();
//    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
//                .authorizeRequests()
//                .antMatchers("**/secure/**").authenticated()
//                .and()
                .authorizeRequests()
                .antMatchers("**/login/**").permitAll()
                .and()
                .authorizeRequests()
                .anyRequest().fullyAuthenticated().and().httpBasic();
        httpSecurity.csrf().disable();
    }
    // </editor-fold>

}

