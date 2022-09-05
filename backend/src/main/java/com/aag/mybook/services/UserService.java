package com.aag.mybook.services;

import com.aag.mybook.dto.UserDTO;
import com.aag.mybook.entities.User;
import com.aag.mybook.repositories.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public void save(UserDTO dto) {
        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(dto, User.class);
        repository.save(user);
    }
}
