package com.project.blog.controller;

import com.project.blog.data.SignUpRepository;
import com.project.blog.model.SignUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@Controller
@RequestMapping("/signup")
public class SignUpController {

    @Autowired
    private SignUpRepository signUpRepository;

    @GetMapping
    public String showreg(Model model){
        model.addAttribute("signup",new SignUp());
        return "signup";
    }
    @PostMapping
    public String processRegistrationFrom(@Valid SignUp signUp, Model model){

        signUpRepository.save(signUp);

        return "redirect:/signupsuccess";
    }


}

