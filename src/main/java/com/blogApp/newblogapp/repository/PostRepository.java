package com.blogApp.newblogapp.repository;

import com.blogApp.newblogapp.entity.CategoryUser;
import com.blogApp.newblogapp.entity.Post;
import com.blogApp.newblogapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
    List<Post> findByUser(User user);
    List<CategoryUser> findByCategory(CategoryUser categoryUser);
}
