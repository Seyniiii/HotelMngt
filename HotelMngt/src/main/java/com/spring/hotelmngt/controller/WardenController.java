package com.spring.hotelmngt.controller;

import com.spring.hotelmngt.model.Warden;
import com.spring.hotelmngt.service.WardenService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/warden")
public class WardenController {
    private final WardenService service;

    public WardenController(WardenService service) {
        this.service = service;
    }

    @GetMapping
    public List<Warden> getAll(){
        return  service.getAll();

    }
    @PostMapping
    public  Warden create (Warden warden){
        return service.create(warden);

    }
    @PutMapping
    public Warden update (Warden warden )
    {
        return service.update(warden);

    }
@DeleteMapping("/{id}")
    public void delete (long id ){
        service.delete(id);
    }
}
