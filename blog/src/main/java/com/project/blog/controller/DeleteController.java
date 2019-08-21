package com.project.blog.controller;

import com.project.blog.data.PostRepository;
import com.project.blog.model.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("register")
@RequestMapping("/delete")
public class DeleteController {

    private PostRepository postRepository;
    @Autowired
    public DeleteController(PostRepository postRepository)
    {
        this.postRepository=postRepository;
    }


    @GetMapping
    public String deletePost(@SessionAttribute("login") Login login){
        postRepository.deleteByName(login.getName());
        return "delete";
    }


}
