package com.spring.hotelmngt.repo;

import com.spring.hotelmngt.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepo extends JpaRepository<Booking,Long> {
}
