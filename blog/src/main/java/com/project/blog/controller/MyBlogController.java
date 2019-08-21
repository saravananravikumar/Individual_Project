package com.project.blog.controller;

import com.project.blog.data.PostRepository;
import com.project.blog.data.SignUpRepository;
import com.project.blog.model.Create;
import com.project.blog.model.Login;
import com.project.blog.model.SignUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@SessionAttributes("login")
@RequestMapping("/myblog")

public class MyBlogController {
    private PostRepository postRepository;


    @Autowired
    public MyBlogController(PostRepository postRepository){
        this.postRepository=postRepository;
    }


    @ModelAttribute(name="create")
    public Create create(){
        return new Create();
    }





    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public String deletePost(@PathVariable String id,@SessionAttribute("login")Login login){
        System.out.println(id);
        postRepository.deleteByNameAndId(login.getName(),id);
        return "delete";
    }


    @RequestMapping(value="/edit/{id}",method = RequestMethod.GET)
    public String editPost(@PathVariable String id, @SessionAttribute("login")Login login, @Valid Create create, Model model){
        Create user= (Create) postRepository.findAllByNameAndId(login.getName(),id);
        model.addAttribute("user",user);
        return "edit";
    }




    @ModelAttribute
    @GetMapping
    public String Display(@ModelAttribute Login login, Model model)
    {
        List<Create> posts = new ArrayList<>();
        posts=postRepository.findByName(login.getName());
        model.addAttribute("posts",posts);
        return "myblog";
    }
}
