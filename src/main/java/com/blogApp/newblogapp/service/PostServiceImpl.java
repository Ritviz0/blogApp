package com.blogApp.newblogapp.service;

import com.blogApp.newblogapp.entity.CategoryUser;
import com.blogApp.newblogapp.entity.Post;
import com.blogApp.newblogapp.entity.User;
import com.blogApp.newblogapp.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;
    @Override
    public Post addPost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public List<Post> getAllPost() {
        return null;
    }

    @Override
    public Post getPostById(Long postId) {
        return null;
    }

    @Override
    public void deletePost(Long postId) {

    }

    @Override
    public Post updatePost(Long postId, Post post) {
        return null;
    }

    @Override
    public List<Post> getPostByUser(User userId) {
        return null;
    }

    @Override
    public List<CategoryUser> getCategoryByUser(CategoryUser categoryUser) {
        return null;
    }

    @Override
    public List<Post> searchPosts(String keyword) {
        return null;
    }
}
