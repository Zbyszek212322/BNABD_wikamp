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
@Table(name = "faculty")
public class Faculty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "faculty_name", unique = true)
    private String facultyName;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "faculty")
    private List<Lecturer> lecturers;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "faculty")
    private List<Subject> subjects;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "faculty")
    private List<Student> students;

    public Faculty(Long id, String facultyName) {

        this.id = id;
        this.facultyName = facultyName;
    }
}
