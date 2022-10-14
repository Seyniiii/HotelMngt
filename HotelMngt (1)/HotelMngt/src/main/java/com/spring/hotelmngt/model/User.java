package com.spring.hotelmngt.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@Table(name="users")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private long userId;

    @Column(name="firstname")
    private String firstName;
    @Column(name="lastname")
    private String lastName;
    @Column(name="address")
    private String address;
    @Column(name="username", unique = true)
    private String username;
    @Column(name="email")
    private  String email ;
    @Column(name="password")
    private  String password;
    @Column(name="birthday")
    private LocalDate birthday;
    @Column(name="telephone")
    private int telephone;



    public User() {

    }
}
