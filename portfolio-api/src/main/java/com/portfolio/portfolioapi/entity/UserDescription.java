package com.portfolio.portfolioapi.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user_description")
@Getter @Setter
public class UserDescription extends BaseEntity{

    private String description;

    @ManyToOne
    @JoinColumn(name = "USER_FK")
    @JsonIgnore
    private Users user;
}
