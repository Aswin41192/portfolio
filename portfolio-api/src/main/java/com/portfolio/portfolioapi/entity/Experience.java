package com.portfolio.portfolioapi.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "experiences")
@Getter @Setter
public class Experience extends BaseEntity {
    
    @Column(name = "company_name")
    private String companyName;

    @Column(name = "duration")
    private String duration;

    @Column(name = "order_number")
    private Integer orderNumber;

    
    @ManyToOne
    @JoinColumn(name ="user_fk")
    @JsonIgnore
    private Users user;

    @OneToMany(mappedBy = "experience")
    private List<Project> projects;
}
