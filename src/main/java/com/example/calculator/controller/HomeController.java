package com.example.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("login")
    public String home() {
        return "login";
    }

    @GetMapping("error")
    public String error() {
        return "error";
    }

    @GetMapping
    public String main() {
        return "main";
    }

    @GetMapping("logout")
    public String logout() {
        return "main";
    }
}
