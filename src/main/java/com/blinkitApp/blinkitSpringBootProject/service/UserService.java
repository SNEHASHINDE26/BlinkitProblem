package com.blinkitApp.blinkitSpringBootProject.service;

import com.blinkitApp.blinkitSpringBootProject.model.User;

public interface UserService {

    User findByUsername(String username);

    void saveUser(User user);
}
