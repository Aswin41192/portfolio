package com.portfolio.portfolioapi.services;

import com.portfolio.portfolioapi.entity.Skills;
import com.portfolio.portfolioapi.repository.SkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

@Service
public class SkillsService {
    
    @Autowired
    private SkillsRepository skillsRepository;

    public Iterable<Skills> findAllSkills(){
        return this.skillsRepository.findAll(Sort.by(Direction.ASC, "name"));
    }
}
