package com.blogApp.newblogapp.service;

import com.blogApp.newblogapp.entity.User;
import com.blogApp.newblogapp.errors.UserNotFoundException;
import com.blogApp.newblogapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Long userId,User user) {
        User newuser = userRepository.findById(userId).get();
        if(Objects.nonNull(user.getName()) && !"".equalsIgnoreCase(user.getName()))
        {
            newuser.setName(user.getName());
        }
        if(Objects.nonNull(user.getEmail()) && !"".equalsIgnoreCase(user.getEmail()))
        {
            newuser.setEmail(user.getEmail());
        }
        if(Objects.nonNull(user.getPassword()) && !"".equalsIgnoreCase(user.getPassword()))
        {
            newuser.setPassword(user.getPassword());
        }
        if(Objects.nonNull(user.getAbout()) && !"".equalsIgnoreCase(user.getAbout()))
        {
            newuser.setAbout(user.getAbout());
        }
        return userRepository.save(newuser);
    }

    @Override
    public User getUserById(Long userId) throws UserNotFoundException {
        Optional<User> user = userRepository.findById(userId);
        if(!user.isPresent()){
            throw new UserNotFoundException("user not available");
        }
        return user.get();
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long userid) {
        userRepository.deleteById(userid);
    }
}
