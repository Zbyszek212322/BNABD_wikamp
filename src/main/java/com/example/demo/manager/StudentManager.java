package com.example.demo.manager;

import com.example.demo.dao.FacultyRepository;
import com.example.demo.dao.StudentRepository;
import com.example.demo.dao.entity.Faculty;
import com.example.demo.dao.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentManager {

    private final StudentRepository studentRepository;
    private final FacultyRepository facultyRepository;

    @Autowired
    public StudentManager(StudentRepository studentRepository, FacultyRepository facultyRepository) {
        super();
        this.studentRepository = studentRepository;
        this.facultyRepository = facultyRepository;
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

    public Iterable<Student> findAllStudentsInFaculty(String facultyName) {

        Iterable<Student> studentsInFaculty = studentRepository.findByFaculty(facultyRepository.findByFacultyName(facultyName));
        return studentsInFaculty;
    }

    public Iterable<Student> findAllStudentsByFacultyIdAndStudentName(Long facultyId, String studentLastName) {

        Faculty faculty = facultyRepository.findFirstById(facultyId);
        Iterable<Student> studentsInFaculty = studentRepository.findByLastNameAndFaculty(studentLastName, faculty);

        return studentsInFaculty;
    }
}
