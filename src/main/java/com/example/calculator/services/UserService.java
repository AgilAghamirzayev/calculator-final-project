package com.example.calculator.services;

import com.example.calculator.model.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService {

    User save(User user);
    Optional<User> findByEmail(String email);
}
