package com.spring.hotelmngt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@Table(name="admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long adminId;

    @Column(unique = true)
    private String firstName;

    @Column(unique = true)
    private String lastName;
    private String address;
    private int telephone;
    private String email;
    private String username;
    private String password;

   @OneToMany(
            cascade = CascadeType.DETACH
    )
            @JoinTable(name = "User")
    List<User> user;

    public Admin() {

    }


}