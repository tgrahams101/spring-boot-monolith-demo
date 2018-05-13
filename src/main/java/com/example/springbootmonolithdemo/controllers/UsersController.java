package com.example.springbootmonolithdemo.controllers;
import com.example.springbootmonolithdemo.models.User;
import com.example.springbootmonolithdemo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

//import java.util.List;

@RestController
public class UsersController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public Iterable<User> findAllUsers() {
//        return new ArrayList<User>();
        return userRepository.findAll();

    }

    @GetMapping("/users/{userId}")
    public Optional<User> findUserById(@PathVariable Long userId) {
        return userRepository.findById(userId);
    }

    @DeleteMapping("/users/{userId}")
    public HttpStatus deleteUserById(@PathVariable Long userId) {
        userRepository.deleteById(userId);
        return HttpStatus.OK;
    }

    @PostMapping("/users")
    public User createNewUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }

    @PatchMapping("/users/{userId}")
        public User updateUserById(@PathVariable Long userId, @RequestBody User userRequest) {
            System.out.println("SYSTEM OUT" + userId + "AND" + userRequest);
            User userFromDb = userRepository.findById(userId).get();

            userFromDb.setUserName(userRequest.getUserName());
            userFromDb.setFirstName(userRequest.getFirstName());
            userFromDb.setLastName(userRequest.getLastName());

            return userRepository.save(userFromDb);

    }

}