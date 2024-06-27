package com.example.postdemo.controller;

import com.example.postdemo.payload.PostDTO;
import com.example.postdemo.sevice.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public class Taskcontroller {
    private PostService postService;
    public Taskcontroller(PostService PostService)
    {
        this.postService=postService;
    }
    public ResponseEntity<PostDTO> createPost(@RequestBody PostDTO)
    {
        PostDTO resObj=postService.createPost(postDTO);
        return new ResponseEntity<>(resObj, HttpStatus.CREATED);
    }

}
