package com.blogApp.newblogapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;
    private String title;
    private String content;
    private String imageName;
    private Date addedDate;
    @ManyToOne
    private User user;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryUser category;
}
