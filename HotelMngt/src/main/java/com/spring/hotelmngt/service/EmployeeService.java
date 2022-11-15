package com.spring.hotelmngt.service;


import com.spring.hotelmngt.model.Employee;
import com.spring.hotelmngt.repo.EmployeeRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class EmployeeService {
    private final   EmployeeRepo repo;

    public EmployeeService(EmployeeRepo repo) {
        this.repo = repo;
    }

    public Optional<Employee> getbyId(long id) {
      return repo.findById(id)  ;
    }

    public List<Employee> getAll(){
        return  repo.findAll();

    }



    public Employee create (Employee employee) {
        return  repo.save(employee);
    }
    public Employee upddate (Employee employee) {
        return  repo.save(employee);
    }
    public void delete (long id){
        repo.deleteById(id);
    }


}
