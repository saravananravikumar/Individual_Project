package com.project.blog.controller;

import com.project.blog.data.SignUpRepository;
import com.project.blog.model.Login;
import com.project.blog.model.SignUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/login")
@SessionAttributes("login")
public class LoginController {

    private SignUpRepository signUpRepository;
    @Autowired
    private LoginController(SignUpRepository signUpRepository)
    {
        this.signUpRepository = signUpRepository;
    }


    @ModelAttribute(name="login")
    public Login login()
    {
        return new Login();
    }

    @GetMapping
    public String showLogin(Model model) {

        model.addAttribute("login", new Login());
        return "login";
    }
    @PostMapping
    public String processLogin(@Valid Login login, Errors errors, Model model) {
        if (errors.hasErrors()) {
            return "login";
        } else {
            List<SignUp> user=signUpRepository.findByNameAndPassword(login.getName(),login.getPassword());
            login.setName(login.getName());


            if (user.isEmpty()) {

                return "redirect:/login";
            } else {
                model.addAttribute("user", user);
                return "redirect:/myblog";
            }
        }

    }
}
