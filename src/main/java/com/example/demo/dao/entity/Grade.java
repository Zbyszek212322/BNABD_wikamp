package com.example.demo.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "grade")
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "grade")
    private BigDecimal grade;

    @ManyToOne
    @JoinColumn(name = "index_no", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "faculty_id") //, nullable = false)
    private Faculty faculty;
}
