package com.blogApp.newblogapp.service;

import com.blogApp.newblogapp.entity.CategoryUser;
import com.blogApp.newblogapp.repository.CategoryRepository;
import jdk.jfr.Category;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public CategoryUser createCategory(CategoryUser categoryUser) {
        return categoryRepository.save(categoryUser);
    }

    @Override
    public CategoryUser updateCategory(Long categoryId, CategoryUser category) {
        CategoryUser newCategoryUser = categoryRepository.findById(categoryId).get();
        if(Objects.nonNull(category.getCategoryTitle()) && "".equalsIgnoreCase(category.getCategoryTitle()))
        {
            newCategoryUser.setCategoryTitle(category.getCategoryTitle());
        }
        if(Objects.nonNull(category.getCategoryDescription()) && "".equalsIgnoreCase(category.getCategoryDescription()))
        {
            newCategoryUser.setCategoryDescription(category.getCategoryDescription());
        }
        return categoryRepository.save(newCategoryUser);
    }

    @Override
    public CategoryUser getCategoryById(Long categoryId) {
        return categoryRepository.findById(categoryId).get();
    }

    @Override
    public List<CategoryUser> getAllCategory()
    {
        return categoryRepository.findAll();
    }

    @Override
    public void deleteCategory(Long categoryId) {
        categoryRepository.deleteById(categoryId);

    }
}
