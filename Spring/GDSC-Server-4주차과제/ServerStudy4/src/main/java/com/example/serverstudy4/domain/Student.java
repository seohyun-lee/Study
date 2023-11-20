package com.example.serverstudy4.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Student {
    @Id
    @GeneratedValue
    @Column(name="student_id")
    private Long id;
    private String name;

    @OneToOne
    private IDCard idCard;
}
