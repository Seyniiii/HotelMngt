package com.spring.hotelmngt.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long bookingId;

    private LocalDate startDate;

    private LocalDate endDate;

    private int numberOfOccupant;

    private double amount;











}
