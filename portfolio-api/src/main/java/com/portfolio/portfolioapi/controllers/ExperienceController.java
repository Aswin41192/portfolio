package com.portfolio.portfolioapi.controllers;

import com.portfolio.portfolioapi.entity.Experience;
import com.portfolio.portfolioapi.services.ExperienceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/experience")
@CrossOrigin
public class ExperienceController {

    @Autowired
    private ExperienceService experienceService;
    
    @GetMapping
    public ResponseEntity<Iterable<Experience>> findAllExperiences(){
        Iterable<Experience> experiences = experienceService.findAll();
        return ResponseEntity.ok(experiences);
    }
}
