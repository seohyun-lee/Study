package com.example.serverstudy4.domain_leeseohyun;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue
    @Column(name="user_id")
    private Long id;        //id
    private String name;    //이름
    private int age;        //나이
    private String country; //국가
    private String city;    //도시
    private String postal_code;  //우편번호

    @OneToMany(mappedBy="user") //one 쪽이다
    private List<Blogpost> blogposts = new ArrayList<>();
}
