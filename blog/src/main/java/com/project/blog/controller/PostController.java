package com.project.blog.controller;

import com.project.blog.data.PostRepository;
import com.project.blog.model.Create;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/create"})
public class PostController {
    private PostRepository postRepo;

    @Autowired
    public PostController(PostRepository postRepo) {
        this.postRepo = postRepo;
    }

    @GetMapping
    public String print(Model model) {
        model.addAttribute("create", new Create());
        return "create";
    }

    @PostMapping
    public String display(Create create) {
        this.postRepo.save(create);
        return "create";
    }
}
