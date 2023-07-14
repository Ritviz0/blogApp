package com.blogApp.newblogapp.controller;

import com.blogApp.newblogapp.entity.Post;
import com.blogApp.newblogapp.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    @Autowired
    private PostService postService;

   
}
