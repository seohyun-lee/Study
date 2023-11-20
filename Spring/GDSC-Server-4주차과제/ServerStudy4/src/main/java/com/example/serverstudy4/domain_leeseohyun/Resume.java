package com.example.serverstudy4.domain_leeseohyun;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Resume {
    @Id
    @GeneratedValue
    @JoinColumn(name="resume_id")
    private Long id;
    private String title;   //제목
    private String content; //내용

    @ManyToOne //Many 쪽임
    @JoinColumn(name="user_id")
    private User user;
}
