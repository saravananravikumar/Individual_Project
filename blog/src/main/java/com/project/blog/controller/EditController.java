package com.project.blog.controller;

import com.project.blog.data.PostRepository;
import com.project.blog.model.Create;
import com.project.blog.model.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@SessionAttributes("login")
@RequestMapping("/myblog/edit/")
public class EditController {


    private PostRepository postRepository;
    @Autowired
    public EditController(PostRepository postRepository)
    {
        this.postRepository=postRepository;
    }

    @ModelAttribute(name="create")
    public Create create(){
        return new Create();
    }

/*    @GetMapping
    public String editPost(@SessionAttribute("login") Login login, Model model){
        Create user= (Create) postRepository.findAllByName(login.getName());
        model.addAttribute("user",user);
        return "edit";
    }*/

    @PostMapping(value = "/{id}")
    public String setChanges(@PathVariable String id, @Valid Create create, @SessionAttribute("login") Login login, Model model){
        Create user1= (Create) postRepository.findAllByNameAndId(login.getName(),id);
        user1.setMessage(create.getMessage());
        user1.setSummary(create.getSummary());
        user1.setTitle(create.getTitle());
        postRepository.save(user1);
        /*model.addAttribute("user",user1);*/
        return "redirect:/myblog";
    }


}
