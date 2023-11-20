package com.example.serverstudy4.domain_leeseohyun;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class Blogpost {
    @Id
    @GeneratedValue
    @Column(name="blogpost_id")
    private Long id;        //id
    private String title;   //제목
    private String content; //내용
    private LocalDateTime timestamp;  //포스팅된 당시의 시각

    //Many 쪽에 외래키를 둔다. User, Category둘 다 대해 Many쪽임
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
