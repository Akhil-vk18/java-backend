package com.blogapp.BloggingApp.controller;

import com.blogapp.BloggingApp.model.Post;
import com.blogapp.BloggingApp.repository.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @Autowired
    BlogRepo repo;
@GetMapping("/")
    public  String postView(Model model){
        model.addAttribute("post",repo.findAll());
        return "index";
    }

    @GetMapping("/newpost")
    public String newPost(Model model){
        model.addAttribute("post",new Post());
        return "new_post";
    }
    @PostMapping("/save")
    public String savePost(@ModelAttribute("post") Post post){
    repo.save(post);
    return "redirect:/";
    }
    @GetMapping("/edit/{id}")
    public String editPost(@PathVariable int id,Model model){
    model.addAttribute("post",repo.findById(id));
    return "edit_post";
}
@PostMapping("/update")
public String update(@ModelAttribute("post") Post post){
    repo.save(post);
    return "redirect:/";
}
@GetMapping("/delete/{id}")
    public String deletePost(@PathVariable int id,Model model){
    repo.deleteById(id);
    return  "redirect:/";
}
}
