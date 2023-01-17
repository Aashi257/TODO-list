package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.constant.Constants;
import com.example.service.Login;

@RestController
@RequestMapping("/springh2")
public class LoginController {

    @Autowired
    Login service;
    
    @GetMapping("/login")
    public ModelAndView showLoginPage(){
        return new ModelAndView("login");
    }

    @PostMapping(value="/login")
    public ModelAndView showWelcomePage(ModelMap model, 
    		@RequestParam String name, @RequestParam String password){

        boolean isValidUser = service.validateUser(name, password);

        if (!isValidUser) {
            model.put("errorMessage", "Invalid Credentials");
            return new ModelAndView(Constants.LOGIN);
        }

        model.put("name", name);
        model.put("password", password);

        return new ModelAndView(Constants.WELCOME);
    }
}
