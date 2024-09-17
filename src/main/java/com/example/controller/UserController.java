package com.example.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.Post;
import com.example.service.PostService;

@RestController
@RequestMapping("/posts")
public class UserController {
    @Autowired
    private PostService postService;
    @GetMapping("/test")

    public String test()
    {
        return "api is working fine";
    }
    
    @GetMapping("/posts")
    public List<Post> getPosts()
    {
        return this.postService.getPosts();
    }
}

