package com.portfolio.portfolioapi.services;

import com.portfolio.portfolioapi.entity.Experience;
import com.portfolio.portfolioapi.entity.Users;
import com.portfolio.portfolioapi.repository.ExperienceRepository;
import com.portfolio.portfolioapi.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService {
    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ExperienceRepository experienceRepository;

    public Iterable<Experience> findAll(){
        Users user = userRepository.findById(1L).get();
        return this.experienceRepository.findAllExperiencesByUser(user, Sort.by(Direction.DESC, "orderNumber"));
    }
}
