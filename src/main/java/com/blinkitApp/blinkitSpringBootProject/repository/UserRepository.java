package com.blinkitApp.blinkitSpringBootProject.repository;

import com.blinkitApp.blinkitSpringBootProject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
