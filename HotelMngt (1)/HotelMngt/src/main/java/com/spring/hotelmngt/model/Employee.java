package com.spring.hotelmngt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  String emplId;

    private  String firstName;
    private  String lastName;
    private String job;
    private  double salary;


    public Employee() {

    }
}
