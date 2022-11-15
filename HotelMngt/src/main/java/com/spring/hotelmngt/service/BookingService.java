package com.spring.hotelmngt.service;



import com.spring.hotelmngt.dto.BookingDto;
import com.spring.hotelmngt.model.Booking;
import com.spring.hotelmngt.repo.BookingRepo;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
public class BookingService {
    private final BookingRepo repo;
    private final ModelMapper mapper;

    public BookingService(BookingRepo repo, ModelMapper mapper) {
        this.repo = repo;

        this.mapper = mapper;
    }


    public  List<Booking> getAll(){
        return
                repo.findAll();
    }

    public Booking create (Booking booking) {

      booking.setStartDate(LocalDate.now());
      //booking.setEndDate(booking.getStartDate().plusDays(days));
System.out.println(booking.getStartDate());
System.out.println(booking.getEndDate());
return repo.save(booking);
    }


public Booking update (Booking dto){
    Booking booking = mapper.map(dto,Booking.class);


    return  repo.save(booking);
}

public  void delete (long id){
        repo.deleteById(id);
}

}
