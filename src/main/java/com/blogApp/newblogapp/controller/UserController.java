package com.blogApp.newblogapp.controller;

import com.blogApp.newblogapp.entity.User;
import com.blogApp.newblogapp.errors.UserNotFoundException;
import com.blogApp.newblogapp.repository.UserRepository;
import com.blogApp.newblogapp.service.UserService;
import com.blogApp.newblogapp.service.UserServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User createUser(@Valid @RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/user")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }
    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable("id") Long userId) {
        userService.deleteUser(userId);
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Long userId) throws UserNotFoundException {
        return userService.getUserById(userId);
    }

    @PutMapping("/user/{id}")
    public User updateUser(@Valid @PathVariable("id") Long userId,@RequestBody User user) {
        return userService.updateUser(userId,user);
    }
}
