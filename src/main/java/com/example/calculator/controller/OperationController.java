package com.example.calculator.controller;

import com.example.calculator.model.Operation;
import com.example.calculator.model.User;
import com.example.calculator.services.OperationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/operation")
@RequiredArgsConstructor
public class OperationController {

    private final OperationService operationService;

    @GetMapping
    public String handle_get(Model model) {
        model.addAttribute("operations", new Operation());
        return "main";
    }

    @PostMapping
    public String handle_post(@Valid @ModelAttribute("operations") Operation operation,
                              BindingResult result,
                              RedirectAttributes ra) {

        if (result.hasErrors()) return "main";

        String operation1 = operation.getOperation();
        System.out.println(operation1);

        operation.setResult(operation1);
        return "main";
    }
}
