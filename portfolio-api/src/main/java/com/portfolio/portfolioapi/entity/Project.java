package com.portfolio.portfolioapi.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Entity @Table(name = "projects")
@Getter @Setter
public class Project extends BaseEntity {
    
    @Column(name = "project_name")
    private String projectName;

    @Column(name = "project_description")
    private String projectDescription;

    @ManyToOne
    @JoinColumn(name = "experience_fk")
    @JsonIgnore
    private Experience experience;

    @OneToMany(mappedBy = "project")
    private Set<ProjectRoles> roles;

}
