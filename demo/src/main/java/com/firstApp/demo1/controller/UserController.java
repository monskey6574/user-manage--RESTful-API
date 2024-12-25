package com.firstApp.demo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.firstApp.demo1.dto.UserDTO;
import java.util.List;

import com.firstApp.demo1.service.UserService;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/")
public class UserController {
    @Autowired
    private  UserService userService;
    @GetMapping("/user")
    public List<UserDTO> getUser() {
        return userService.getAllUsers();
    }



  
}
