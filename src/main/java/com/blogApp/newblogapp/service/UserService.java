package com.blogApp.newblogapp.service;

import com.blogApp.newblogapp.entity.User;
import com.blogApp.newblogapp.errors.UserNotFoundException;

import java.util.List;

public interface UserService {
    public User createUser(User user);
    public User updateUser(Long userId,User user);
    public User getUserById(Long userId) throws UserNotFoundException;
    public List<User> getAllUser();
    public void deleteUser(Long userid);
}
