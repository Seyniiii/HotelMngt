package com.spring.hotelmngt.service;


import com.spring.hotelmngt.model.Admin;
import com.spring.hotelmngt.repo.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private final AdminRepo repo;

    public AdminService(AdminRepo repo) {
        this.repo = repo;
    }

    public List<Admin> getAll(){
        return repo.findAll();
    }

        public Admin create (Admin admin){
        return repo.save(admin);
    }

    public Admin update(Admin admin) {
        return repo.save(admin);

    }

    public void delete (long id ){
        repo.deleteById(id);

    }










}
