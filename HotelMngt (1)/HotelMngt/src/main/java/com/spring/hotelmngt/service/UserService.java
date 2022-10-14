package com.spring.hotelmngt.service;

import com.spring.hotelmngt.dto.UserDto;
import com.spring.hotelmngt.model.User;
import com.spring.hotelmngt.repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@Transactional
public class UserService {

    private final UserRepo repo;
    private final ModelMapper mapper;

    public UserService(UserRepo repo, ModelMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    public List<User> getAll(){
        return repo.findAll();
    }


    public UserDto create ( UserDto dto ){
        User user=mapper.map(dto, User.class);
        user= repo.save(user);
        UserDto userDto= mapper.map(user, UserDto.class);
        return userDto;
    }

    public  User update(User user)
    {
        return repo.save(user);

    }

    public void  delete (long id ){
        repo.deleteById(id);
    }
}
