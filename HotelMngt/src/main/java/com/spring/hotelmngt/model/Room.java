package com.spring.hotelmngt.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name="room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long roomId;

    private String roomType;

    @Column(length = 14)
    private  int roomPhone;
    private String img ;

   // @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER,




// @ManyToMany(
      //  cascade = CascadeType.DETACH
//)
//@JoinTable(name ="booking")
//List<Booking> booking;
    //@ManyToOne
            //(cascade = CascadeType.ALL, fetch = FetchType.LAZY, targetEntity = Admin.class)
   // private Admin admin;

}
