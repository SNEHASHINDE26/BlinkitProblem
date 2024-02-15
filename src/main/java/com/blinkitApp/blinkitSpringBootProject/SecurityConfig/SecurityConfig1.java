package com.blinkitApp.blinkitSpringBootProject.SecurityConfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@EnableWebSecurity
public class SecurityConfig1 extends WebSecurityConfigurerAdapter{

    @Override
    protected void configure(HttpSecurity http)throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/signup", "/login").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                   .loginPage("/login")
                   .loginProcessingUrl("/perform_login")
                   .usernameParameter("username")
                   .passwordParameter("password")
                   .permitAll()
                   .and()
                .logout()
                   .permitAll();
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();

    }

}




