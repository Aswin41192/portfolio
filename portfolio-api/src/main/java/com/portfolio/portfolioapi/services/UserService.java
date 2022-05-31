package com.portfolio.portfolioapi.services;

import java.util.stream.Collectors;

import com.portfolio.portfolioapi.entity.Experience;
import com.portfolio.portfolioapi.entity.Users;
import com.portfolio.portfolioapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Iterable<Users> getAllUsers(){
        log.info("*****Fetching Users*****************");
        return userRepository.findAll();
    }

    public Iterable<Experience> findExperiencesById(Long id){
        Users user = userRepository.findExperiencesById(id).orElse(null);
        return user.getExperiences().stream().sorted((e1,e2)->e2.getOrderNumber().compareTo(e1.getOrderNumber())).collect(Collectors.toList());
    }
}
