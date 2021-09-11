package com.talkkia.api.controller;

import com.talkkia.api.entity.User;
import com.talkkia.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/",  produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<User> getAllUser(){

        Flux<User> user= userRepository.findAll();
        user.
        return user;
    }

}
