package com.spring.hotelmngt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private  long userId;
    private String firstName;
    private String lastName;
    private String address;
    private String username;
    private  String email ;
    private  String password;
    private String birthday;
    private int telephone;




}
