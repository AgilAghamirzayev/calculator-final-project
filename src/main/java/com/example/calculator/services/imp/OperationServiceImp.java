package com.example.calculator.services.imp;

import com.example.calculator.model.Operation;
import com.example.calculator.model.User;
import com.example.calculator.repository.OperationRepository;
import com.example.calculator.repository.UserRepository;
import com.example.calculator.services.CoreService;
import com.example.calculator.services.OperationService;
import com.example.calculator.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OperationServiceImp implements OperationService {

    private final OperationRepository operationRepository;

    @Override
    public Operation save(Operation operation) {
        return operationRepository.save(operation);
    }


}
