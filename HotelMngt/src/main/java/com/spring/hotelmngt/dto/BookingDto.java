package com.spring.hotelmngt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
 @AllArgsConstructor
@NoArgsConstructor
public class BookingDto {
    private  long bookingId;

    private String startDate;

    private String endDate;

    private int numberOfOccupant;

    private double amount;
}
