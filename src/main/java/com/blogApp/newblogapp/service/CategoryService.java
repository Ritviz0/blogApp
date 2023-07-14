package com.blogApp.newblogapp.service;

import com.blogApp.newblogapp.entity.CategoryUser;
import jdk.jfr.Category;

import java.util.List;

public interface CategoryService {
    public CategoryUser createCategory(CategoryUser category);
    public CategoryUser updateCategory(Long categoryId, CategoryUser category);
    public CategoryUser getCategoryById(Long categoryId);
    public List<CategoryUser> getAllCategory();
    public void deleteCategory(Long categoryId);

}
