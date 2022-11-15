package com.spring.hotelmngt.controller;

import com.spring.hotelmngt.model.Employee;
import com.spring.hotelmngt.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private  final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }
@GetMapping("/{id}")
public Optional<Employee> getbyId( @PathVariable long id ){
        return  service.getbyId(id);
}
    @GetMapping
    public List<Employee> getAll(){
        return service.getAll();

    }


    @PostMapping
    public Employee create ( @RequestBody Employee employee)
    {
        return  service.create(employee);
    }

    @PutMapping
    public Employee update (@RequestBody Employee employee)
    {
        return  service.upddate(employee);
    }
    @DeleteMapping("/{id}")
    public void delete (@PathVariable long id){
        service.delete(id);
    }
}
