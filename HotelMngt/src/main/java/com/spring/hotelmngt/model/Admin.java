//package com.spring.hotelmngt.model;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.hibernate.engine.internal.Cascade;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Table(name="admin")
//public class Admin {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long adminId;
//
//    private String firstName;
//
//    private String lastName;
//
//    private String address;
//
//    private int telephone;
//
//    private String email;
//
//    private String role ="ROLE_ADMIN";
//
//    private String username;
//
//    private String password;
//
//   @OneToMany
//    //(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//   //@JoinTable(name = "user")
//    private List<User> user;
//
//    @OneToMany(cascade= CascadeType.ALL, fetch = FetchType.EAGER)
//    private List<Room> room ;
//
//
//
//}