package com.ironsouls.account.service;

import com.ironsouls.account.exception.UserNotFoundException;
import com.ironsouls.account.model.User;
import com.ironsouls.account.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserById(UUID userId){
        return userRepository.findById(userId)
                .orElseThrow(()-> new UserNotFoundException(userId));
    }

    public User saveUser (User user) {
        return userRepository.save(user);
    }

}
