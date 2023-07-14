package com.blogApp.newblogapp.controller;

import com.blogApp.newblogapp.service.CategoryService;
import com.blogApp.newblogapp.entity.CategoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @PostMapping("/category")
    public CategoryUser createCategory(@RequestBody CategoryUser categoryUser) {
        return categoryService.createCategory(categoryUser);
    }
    @PutMapping("/category/{id}")
    public CategoryUser updateCategory(@PathVariable("id") Long categoryId,@RequestBody CategoryUser category){
        return categoryService.updateCategory(categoryId,category);
    }

    @GetMapping("/category/{id}")
    public CategoryUser getCategoryById(@PathVariable("id") Long categoryId ) {
        return categoryService.getCategoryById(categoryId);
    }
    @GetMapping("/category")
    public List<CategoryUser> getAllCategory() {
        return categoryService.getAllCategory();
    }
    @DeleteMapping("/category/{id}")
    public void deleteCategory(@PathVariable("id") Long categoryId) {
         categoryService.deleteCategory(categoryId);
    }
}
