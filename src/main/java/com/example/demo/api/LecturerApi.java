package com.example.demo.api;

import com.example.demo.dao.entity.Lecturer;
import com.example.demo.manager.LecturerManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/lecturers")
public class LecturerApi {

    private LecturerManager lecturerManager;

    @Autowired
    public LecturerApi(LecturerManager lecturerManager) {

        this.lecturerManager = lecturerManager;
    }

    @GetMapping("/all")
    @PreAuthorize("hasRole('ADMIN')")
    public Iterable<Lecturer> getAll() {

        return lecturerManager.findAllLecturers();
    }

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public Optional<Lecturer> getById(@RequestParam Long id) {

        return lecturerManager.findLecturerById(id);
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Lecturer> addLecturer(@RequestBody Lecturer lecturer) {
        Lecturer lec = lecturerManager.saveLecturer(lecturer);
        return  new ResponseEntity<>(lec, HttpStatus.OK);
    }

    @DeleteMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<String> deleteLecturer(@RequestParam(name = "lecturerId") Long lecturerId) {
        lecturerManager.deleteLecturerById(lecturerId);
        return new ResponseEntity<>("Lecturer with ID:" + lecturerId + " deleted successfully", HttpStatus.OK);
    }

    @PutMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Lecturer> updateLecturer(@RequestBody Lecturer lecturer) {
        Lecturer lec = lecturerManager.saveLecturer(lecturer);
        return  new ResponseEntity<>(lec, HttpStatus.OK);
    }

}
