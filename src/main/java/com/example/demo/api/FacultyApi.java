package com.example.demo.api;

import com.example.demo.dao.entity.Faculty;
import com.example.demo.dao.entity.Student;
import com.example.demo.manager.FacultyManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/faculties")
public class FacultyApi {

    private FacultyManager facultyManager;

    @Autowired
    public FacultyApi(FacultyManager facultyManager) {

        this.facultyManager = facultyManager;
    }

    @GetMapping("/all")
    public Iterable<Faculty> getAll() {

        return facultyManager.findAllFaculties();
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public Optional<Faculty> getById(@PathVariable @RequestBody Long id) {

        return facultyManager.findFacultyById(id);
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public Faculty addFaculty(@RequestBody Faculty faculty) {
      return facultyManager.saveFaculty(faculty);
    }

    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public Iterable<Faculty> deleteFaculty(@PathVariable @RequestBody Long id) {
        facultyManager.deleteFacultyById(id);
        return facultyManager.findAllFaculties();
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public Iterable<Faculty> updateFaculty(@PathVariable(value = "id") Long id,
                                                 @RequestBody Faculty faculty) {
        Faculty fac = facultyManager.findFirstFacultyById(id);
        fac.setFacultyName(faculty.getFacultyName());
        facultyManager.saveFaculty(fac);
        return  facultyManager.findAllFaculties();
    }

}
