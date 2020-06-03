package com.example.demo.api;

import com.example.demo.dao.entity.Grade;
import com.example.demo.manager.GradeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/grades")
public class GradeApi {

    private GradeManager gradeyManager;

    @Autowired
    public GradeApi(GradeManager gradeyManager) {

        this.gradeyManager = gradeyManager;
    }

    @GetMapping("/all")
    public Iterable<Grade> getAll() {

        return gradeyManager.findAllGrades();
    }

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public Optional<Grade> getById(@RequestParam Long id) {

        return gradeyManager.findGradeById(id);
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Grade> addGrade(@RequestBody Grade grade) {
        Grade gr = gradeyManager.saveGrade(grade);
        return  new ResponseEntity<>(gr, HttpStatus.OK);
    }

    @DeleteMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<String> deleteGrade(@RequestParam(name = "gradeId") Long gradeId) {
        gradeyManager.deleteGradeById(gradeId);
        return new ResponseEntity<>("Grade with ID:" + gradeId + " deleted successfully", HttpStatus.OK);
    }

    @PutMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Grade> updateGrade(@RequestBody Grade grade) {
        Grade gr = gradeyManager.saveGrade(grade);
        return  new ResponseEntity<>(gr, HttpStatus.OK);
    }

}
