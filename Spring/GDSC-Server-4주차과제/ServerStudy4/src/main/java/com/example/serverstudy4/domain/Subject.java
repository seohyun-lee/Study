package com.example.serverstudy4.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@Table(name="subject")
public class Subject {
    @Id
    @GeneratedValue
    @Column(name="subject_id")
    private Long id;
    private String name;

    @OneToMany(mappedBy="subject")
    private List<Part> parts = new ArrayList<>();
    //삭제하면 단방향
}
