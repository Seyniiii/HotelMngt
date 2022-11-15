package com.spring.hotelmngt.service;

import com.spring.hotelmngt.model.Warden;
import com.spring.hotelmngt.repo.WardenRepo;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class WardenService {

private final WardenRepo repo;

    public WardenService(WardenRepo repo) {
        this.repo = repo;
    }
    public List<Warden> getAll(){
        return  repo.findAll();

    }
    public  Warden create (Warden warden){
        return repo.save(warden);

    }
    public Warden update (Warden warden )
    {
        return repo.save(warden);

    }

    public void delete (long id ){
        repo.deleteById(id);
    }
}
