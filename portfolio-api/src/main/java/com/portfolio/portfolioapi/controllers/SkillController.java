package com.portfolio.portfolioapi.controllers;

import com.portfolio.portfolioapi.entity.Skills;
import com.portfolio.portfolioapi.services.SkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class SkillController {

  @Autowired
  private SkillsService skillsService;
    
    @GetMapping("/skills")
    public Iterable<Skills> findSkills(){
        return this.skillsService.findAllSkills();
      }

}
