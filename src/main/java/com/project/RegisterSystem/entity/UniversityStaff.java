package com.project.RegisterSystem.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "university_staff")
public class UniversityStaff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @ManyToOne
    @JoinColumn(name = "university_id")
    private University university;

    @OneToOne
    @JoinColumn(name = "user_id",nullable = false)
    private User user;
}
