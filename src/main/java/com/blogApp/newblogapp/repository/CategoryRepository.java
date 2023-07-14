package com.blogApp.newblogapp.repository;

import com.blogApp.newblogapp.entity.CategoryUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryUser,Long> {
}
