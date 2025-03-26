package com.ironsouls.account.service;

import com.ironsouls.account.model.User;
import com.ironsouls.account.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    User getUser(String user){
        return userRepository.findById(UUID.fromString(user)).get();
    }

}
