package com.portfolio.portfolioapi.controllers;

import java.util.List;
import java.util.Optional;

import com.portfolio.portfolioapi.entity.Experience;
import com.portfolio.portfolioapi.entity.Users;
import com.portfolio.portfolioapi.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;
    
    @GetMapping
    public ResponseEntity<Iterable<Users>> getAllUsers(){
        Iterable<Users> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/experiences")
    public ResponseEntity<Iterable<Experience>> findUserExperiences(){
      Iterable<Experience> experiences =  userService.findExperiencesById(1L);
      return ResponseEntity.ok(experiences);
    }
}
