package com.spring.hotelmngt.controller;


import com.spring.hotelmngt.model.Room;
import com.spring.hotelmngt.service.RoomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/room")
@CrossOrigin("*")
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
    public Room create ( @RequestBody Room room){
        return service.create(room);
    }
    @PutMapping("/{id}")
    public Room update ( @RequestBody Room room){
        return  service.update(room);
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable long id ){
        service.delete(id);
    }
}