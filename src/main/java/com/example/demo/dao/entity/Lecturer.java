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
@Table(name = "lecturer")
public class Lecturer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "academic_degree")
    private String academicDegree;

//    @ManyToOne
//    @JoinColumn(name = "subject_id", nullable = false)
//    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "faculty_id") //, nullable = false)
    private Faculty faculty;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lecturer")
    private List<Subject> subjects;
}
