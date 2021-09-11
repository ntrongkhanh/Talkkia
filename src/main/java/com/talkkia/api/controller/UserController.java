package com.talkkia.api.controller;

import com.talkkia.api.entity.User;
import com.talkkia.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/")
    public Flux<User> getAllUser(){

        Flux<User> user= userRepository.findAll();
        return user;
    }

    @GetMapping(value = "/{id}")
    public Mono<User> getUser(@PathVariable Long id){

        Mono<User> user= userRepository.findById(id);
        return user;
    }
}