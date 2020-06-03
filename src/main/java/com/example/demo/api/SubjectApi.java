package com.example.demo.api;

import com.example.demo.dao.entity.Subject;
import com.example.demo.manager.SubjectManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/subjects")
public class SubjectApi {

    private SubjectManager subjectManager;

    @Autowired
    public SubjectApi(SubjectManager subjectManager) {

        this.subjectManager = subjectManager;
    }

    @GetMapping("/all")
    @PreAuthorize("hasRole('ADMIN')")
    public Iterable<Subject> getAll() {

        return subjectManager.findAllSubjects();
    }

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public Optional<Subject> getById(@RequestParam Long id) {

        return subjectManager.findSubjectById(id);
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Subject> addSubject(@RequestBody Subject subject) {
        Subject sub = subjectManager.saveSubject(subject);
        return  new ResponseEntity<>(sub, HttpStatus.OK);
    }

    @DeleteMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<String> deleteSubject(@RequestParam(name = "subjectId") Long subjectId) {
        subjectManager.deleteSubjectById(subjectId);
        return new ResponseEntity<>("Subject with ID:" + subjectId + " deleted successfully", HttpStatus.OK);
    }

    @PutMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Subject> updateSubject(@RequestBody Subject subject) {
        Subject sub = subjectManager.saveSubject(subject);
        return  new ResponseEntity<>(sub, HttpStatus.OK);
    }

}
