package com.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    // HTTP security metodunu override ediyoruz
    @Override
    protected void configure(HttpSecurity http) throws Exception {
     //http.authorizeRequests().anyRequest().permitAll();// No password required, not good
        http.csrf().disable().authorizeRequests().anyRequest().authenticated().and().formLogin().and().httpBasic();
        //Authenticated --> sifreli olarak kullan
    }
}
