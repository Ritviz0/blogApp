package com.blogApp.newblogapp.service;

import com.blogApp.newblogapp.entity.CategoryUser;
import com.blogApp.newblogapp.entity.Post;
import com.blogApp.newblogapp.entity.User;

import java.util.List;

public interface PostService {
    public Post addPost(Post post);
    public List<Post> getAllPost();
    public Post getPostById(Long postId);
    public void deletePost(Long postId);
    public Post updatePost(Long postId,Post post);
    List<Post> getPostByUser(User userId);
    List<CategoryUser> getCategoryByUser(CategoryUser categoryUser);
    List<Post> searchPosts(String keyword);
}
