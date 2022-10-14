package com.spring.hotelmngt.controller;


import com.spring.hotelmngt.dto.UserDto;
import com.spring.hotelmngt.model.User;
import com.spring.hotelmngt.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    public final UserService service;


    public UserController(UserService service) {
        this.service = service;
    }


    @GetMapping
    public List<User> getAll(){
        return service.getAll();
    }

    @PostMapping("/create")
    public UserDto create (@RequestBody UserDto userDto){
        return service.create(userDto) ;
    }

    @PutMapping
    public  User update(@RequestBody User user) {
        return service.update(user);
    }

    @DeleteMapping("/{id}")
    public void  delete (@PathVariable long id ){
       service.delete(id);
    }

}
