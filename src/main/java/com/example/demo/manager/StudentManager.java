package com.example.demo.manager;

import com.example.demo.dao.StudentRepository;
import com.example.demo.dao.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentManager {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentManager(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    public Optional<Student> findStudentById(Long id) {

        return studentRepository.findById(id);
    }

    public Iterable<Student> findAllStudents() {

        return studentRepository.findAll();
    }

    public Student saveStudent(Student student) {

        return studentRepository.save(student);
    }

    public void deleteStudentById(Long id) {

        studentRepository.deleteById(id);
    }
}
