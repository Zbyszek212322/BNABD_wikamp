package com.example.demo.dao;

import com.example.demo.dao.entity.Faculty;
import com.example.demo.dao.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByFaculty(Faculty faculty);
    List<Student> findByLastNameAndFaculty(String lastName, Faculty faculty);
}
