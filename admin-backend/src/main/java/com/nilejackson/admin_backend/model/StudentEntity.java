package com.nilejackson.admin_backend.model;

import ch.qos.logback.core.joran.spi.NoAutoStart;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
public class StudentEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id; 

@Column(name = "first_name")
private String firstName; 

@Column(name = "last_name")
private String lastName;

 @Column(name = "email", nullable = false, unique = true)
    private String email;

   
    
    


}