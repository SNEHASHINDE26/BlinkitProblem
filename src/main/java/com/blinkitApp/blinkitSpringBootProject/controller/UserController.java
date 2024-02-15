package com.blinkitApp.blinkitSpringBootProject.controller;


import com.blinkitApp.blinkitSpringBootProject.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.blinkitApp.blinkitSpringBootProject.service.UserService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/signup")
    public String signup(Model model){
        model.addAttribute("user",new User());
        return "signup";
    }

    @PostMapping("signup")
    public String signup(User user){
        userService.saveUser(user);
        return "redirect:/login";
    }
    @GetMapping("/upload")
    public String upload(){
        return "upload";
    }

}
