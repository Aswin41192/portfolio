package com.portfolio.portfolioapi.repository;

import com.portfolio.portfolioapi.entity.Skills;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends CrudRepository<Skills,Long> {
    Iterable<Skills> findAll(Sort order);
}
