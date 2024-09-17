package com.example.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.model.Post;
@Service
public class PostServiceImpl implements PostService {
        List<Post>list;

        public PostServiceImpl()
        {
            list=new ArrayList<>();
            list.add(new Post(1,"first post","hey,this is my first post"));
            list.add(new Post(2,"second psot","hey,this is my second post"));   

        }
        @Override
        public List<Post>   getPosts()
        {
            return list;
        }   
}
