package com.portfolio.portfolioapi.repository;

import com.portfolio.portfolioapi.entity.Experience;
import com.portfolio.portfolioapi.entity.Users;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.data.repository.CrudRepository;


public interface ExperienceRepository extends CrudRepository<Experience,Long> {
    //@EntityGraph(value = "graph.ProjectsRoles", type = EntityGraphType.LOAD)
    //@Query("Select e from Experience e join fetch Project p on e.id=p.experience.id join fetch ProjectRoles r where r.project in e.projects")
    @EntityGraph(attributePaths = {"projects"})
    Iterable<Experience> findAllExperiencesByUser(Users user,Sort sort);


}
