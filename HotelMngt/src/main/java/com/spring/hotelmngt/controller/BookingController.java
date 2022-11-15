package com.spring.hotelmngt.controller;


import com.spring.hotelmngt.model.Booking;
import com.spring.hotelmngt.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/booking")
public class BookingController {
    private final BookingService service ;



    public BookingController(BookingService service) {

        this.service = service;
    }

    @GetMapping()
    public List<Booking> getAll() {

        return service.getAll();
        }
    @PostMapping()
    public Booking create(@RequestBody Booking booking){
        //System.out.println(booking.getStartDate());
        System.out.println(booking.getEndDate());

        return service.create(booking);
    }

    @PutMapping
    public Booking update(@RequestBody Booking booking){
        return service.update(booking);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable long id ){
        service.delete(id);
    }



}
