package com.example.demo.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "subject")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "subject_name", unique = true)
    private String subjectName;

//    @JsonIgnore
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subject")
//    private List<Lecturer> lecturers;

    @ManyToOne
    @JoinColumn(name = "faculty_id") //, nullable = false)
    private Faculty faculty;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subject")
    private List<Grade> grades;

    @ManyToOne
    @JoinColumn(name = "lecturer_id", nullable = false)
    private Lecturer lecturer;
}
