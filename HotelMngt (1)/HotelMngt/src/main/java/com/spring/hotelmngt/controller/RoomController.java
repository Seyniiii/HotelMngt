package com.spring.hotelmngt.controller;


import com.spring.hotelmngt.model.Room;
import com.spring.hotelmngt.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {

    private final RoomService service;

    public RoomController(RoomService service) {
        this.service = service;
    }


    @GetMapping
    public List<Room> getAll() {
        return service.getAll();
    }
    @PostMapping
    public Room create (Room room){
        return service.create(room);
    }
    @PutMapping
    public Room update (Room room){
        return  service.update(room);
    }

    @DeleteMapping
    public void delete (long id ){
        service.delete(id);
    }
}