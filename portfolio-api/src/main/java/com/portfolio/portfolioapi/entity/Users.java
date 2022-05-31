package com.portfolio.portfolioapi.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.NamedSubgraph;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "USERS")
@Getter @Setter

@NamedEntityGraph(name = "graph.ExperiencesProjectsRoles",
attributeNodes = @NamedAttributeNode(value = "experiences",subgraph = "subgraph.experiences"),
 subgraphs = {
     @NamedSubgraph(name = "subgraph.experiences", 
                    attributeNodes = @NamedAttributeNode(value = "projects",subgraph = "subgraph.projects")),
     @NamedSubgraph(name = "subgraph.projects", attributeNodes = @NamedAttributeNode("roles"))
                    
 }
)
public class Users extends BaseEntity {
    
  
    @Column(name = "image_path")
    private String imagePath;

    private String email;

    @Column(name = "linkedin_profile")
    private String linkedinProfile;

    @OneToMany(mappedBy="user")
    private List<UserDescription> userDescriptions;

    @OneToMany(mappedBy = "user")
    private Set<Experience> experiences;
}
