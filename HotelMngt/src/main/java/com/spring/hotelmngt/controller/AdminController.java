//package com.spring.hotelmngt.controller;
//
//import com.spring.hotelmngt.model.Admin;
//import com.spring.hotelmngt.model.Room;
//import com.spring.hotelmngt.model.User;
//import com.spring.hotelmngt.service.AdminService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//@RequestMapping("/admin")
//public class AdminController {
//
//    public final AdminService service;
//
//    public AdminController(AdminService service) {
//        this.service = service;
//    }
//
//    @GetMapping
//    public List<Admin> getAll(){
//        return service.getAll();
//
//    }
//
//    @PostMapping
//    public Admin create (@RequestBody Admin admin){
//
//        return service.create(admin);
//    }
//
//   @PutMapping
//    public Admin update(@RequestBody Admin admin ) {
//        return service.update(admin);
//
//    }
//
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable long id){
//        service.delete(id);
//}
//}
