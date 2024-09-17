package com.example;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.Post;
import com.example.service.PostService;

@RestController
public class Demorestcontroller {
    @Autowired
    private PostService postService;
    @GetMapping(value="/welcome")
    public ResponseEntity<String> welcomeEndpoint()
    {
        return ResponseEntity.ok("Welcome to Spring boot");
    }
    @GetMapping(value="/testing")
    public ResponseEntity<String> testingEndpoint()
    {
        return ResponseEntity.ok(" testing api is working fine");
    }

    @GetMapping(value="/posts")
    public ResponseEntity<List<Post>> getPosts()
    {
        List<Post> posts=postService.getPosts();
        return ResponseEntity.ok(posts);
    }  
}
