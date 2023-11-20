package com.example.serverstudy4.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Post {
    @Id
    @GeneratedValue
    @Column(name="post_id")
    private Long id;

    //Many 쪽에 외래키를 둔다
    @ManyToOne
    @JoinColumn(name="member_id")
    private Member member;
}
