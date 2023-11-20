package com.example.serverstudy4.domain_leeseohyun;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Category {
    @Id
    @GeneratedValue
    @Column(name="category_id")
    private Long id;    //id
    private String category_name;   //카테고리명

    @OneToMany(mappedBy="category") //one 쪽이다
    private List<Blogpost> blogposts = new ArrayList<>();
}
