package com.aag.mybook.controllers;

import com.aag.mybook.dto.UserDTO;
import com.aag.mybook.entities.User;
import com.aag.mybook.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public List<User> findAll() {
        return service.findAll();
    }

    @PostMapping(value = "/insert")
    public void save(@Valid @RequestBody UserDTO dto) {
        service.save(dto);
    }
}
