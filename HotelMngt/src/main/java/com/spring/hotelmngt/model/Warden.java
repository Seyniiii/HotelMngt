package com.spring.hotelmngt.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@Table(name = "warden")
public class Warden {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long wardenId;
    private String fullName;


    public Warden() {

    }
}
