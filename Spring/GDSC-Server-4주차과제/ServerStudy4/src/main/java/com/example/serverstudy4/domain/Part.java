package com.example.serverstudy4.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name="part")
public class Part {
    @Id
    @GeneratedValue
    @Column(name="part_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="subject_id")
    private Subject subject;
}
