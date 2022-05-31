package com.portfolio.portfolioapi.repository;

import java.util.Optional;

import com.portfolio.portfolioapi.entity.Users;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users,Long> {
    
    @EntityGraph(value = "graph.ExperiencesProjectsRoles",attributePaths = {"experiences"})
    Optional<Users> findExperiencesById(Long id);
}
