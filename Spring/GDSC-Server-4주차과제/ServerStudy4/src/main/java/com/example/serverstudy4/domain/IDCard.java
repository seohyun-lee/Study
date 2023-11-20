package com.example.serverstudy4.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class IDCard {
    @Id
    @GeneratedValue
    @Column(name="card_id")
    private Long id;
    private String name;

    @OneToOne
    private Student student;
}
