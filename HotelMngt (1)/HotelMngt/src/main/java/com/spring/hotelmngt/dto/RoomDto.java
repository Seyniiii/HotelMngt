package com.spring.hotelmngt.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class RoomDto {


    private long roomId;

    private String roomType;

    private String roomPhone;



}
