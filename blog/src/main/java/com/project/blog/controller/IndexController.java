package com.project.blog.controller;

import com.project.blog.data.IndexRepository;
import com.project.blog.data.PostRepository;
import com.project.blog.model.Create;
import com.project.blog.model.Index;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {


    private PostRepository postRepository;
    @Autowired
    public IndexController(PostRepository postRepository){
        this.postRepository=postRepository;
    }

    @GetMapping
    public String display(Model model) {
        List<Create> posts = new ArrayList();
        postRepository.findAll().forEach(i -> posts.add(i));
        model.addAttribute("posts", posts);

        return "index";
    }


}
