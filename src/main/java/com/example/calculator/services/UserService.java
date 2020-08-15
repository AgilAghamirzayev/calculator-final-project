package com.example.calculator.services;

import com.example.calculator.model.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface UserService extends CoreService<User> {
    Optional<User> findByEmail(String email);
}
