create table skills(id int not null auto_increment, 
name varchar(50) not null,
description TEXT not null,
logo_path varchar(50) not null,
primary key(id)
);

insert into skills(name,description,logo_path) values ('Angular','3+ years of experience in Angular 8','images/angular.png');
insert into skills(name,description,logo_path) values ('Node JS','1 year of experience in creating Chat Bot using Node & Express','images/nodejs.png');
insert into skills(name,description,logo_path) values ('Java','8 years of experience in Java','images/java.png');
insert into skills(name,description,logo_path) values ('Spring Boot','3+ years of experience in Spring Boot','images/springboot.png');
insert into skills(name,description,logo_path) values ('Spring Security','Secure Web Applications using Spring Security,JWT,OAuth2','images/spring-security.png');
insert into skills(name,description,logo_path) values ('Docker','Exposure to containerization using Docker','images/docker.png');
insert into skills(name,description,logo_path) values ('Kubernetes','Exposure to Container Orchestration using Kubernetes','images/kubernetes.png');
insert into skills(name,description,logo_path) values ('GCP','Exposure to Google Cloud Platform','images/gcp.png');