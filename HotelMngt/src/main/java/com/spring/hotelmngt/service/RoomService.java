package com.spring.hotelmngt.service;

import com.spring.hotelmngt.model.Room;
import com.spring.hotelmngt.repo.RoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
@Transactional
public class RoomService {

    private final RoomRepo repo;

    public RoomService(RoomRepo repo) {
        this.repo = repo;


    }

    public List<Room> getAll(){
        return repo.findAll();

    }

    public Room create (Room room){
        return repo.save(room);
    }

    public Room update (Room room){
        return  repo.save(room);
    }

    public void delete (long id ){
        repo.deleteById(id);
    }




}




