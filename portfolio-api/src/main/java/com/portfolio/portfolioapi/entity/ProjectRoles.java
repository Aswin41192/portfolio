package com.portfolio.portfolioapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "project_roles")
@Getter @Setter
public class ProjectRoles extends BaseEntity {
    
    @Column(name = "role_description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "project_fk")
    @JsonIgnore
    private Project project;
}
