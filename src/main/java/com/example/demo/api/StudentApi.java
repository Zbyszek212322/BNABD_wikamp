package com.example.demo.api;

import com.example.demo.dao.entity.Student;
import com.example.demo.manager.StudentManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/students")
public class StudentApi {

    private StudentManager studentManager;

    @Autowired
    public StudentApi(StudentManager studentManager) {

        this.studentManager = studentManager;
    }

    @GetMapping("/all")
    @PreAuthorize("hasRole('ADMIN')")
    public Iterable<Student> getAll() {

        return studentManager.findAllStudents();
    }

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public Optional<Student> getById(@RequestParam Long id) {

        return studentManager.findStudentById(id);
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        Student stu = studentManager.saveStudent(student);
        return  new ResponseEntity<>(stu, HttpStatus.OK);
    }

    @DeleteMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<String> deleteStudent(@RequestParam(name = "studentId") Long studentId) {
        studentManager.deleteStudentById(studentId);
        return new ResponseEntity<>("Student with ID:" + studentId + " deleted successfully", HttpStatus.OK);
    }

    @PutMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
        Student stu = studentManager.saveStudent(student);
        return  new ResponseEntity<>(stu, HttpStatus.OK);
    }

}
