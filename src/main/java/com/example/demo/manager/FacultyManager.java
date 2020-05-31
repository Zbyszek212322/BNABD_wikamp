package com.example.demo.manager;

import com.example.demo.dao.FacultyRepository;
import com.example.demo.dao.entity.Faculty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FacultyManager {

    private final FacultyRepository facultyRepository;

    @Autowired
    public FacultyManager(FacultyRepository facultyRepository) {
        super();
        this.facultyRepository = facultyRepository;
    }

    public Optional<Faculty> findFacultyById(Long id) {

        return facultyRepository.findById(id);
    }

    public Iterable<Faculty> findAllFaculties() {

        return facultyRepository.findAll();
    }

    public Faculty saveFaculty(Faculty faculty) {

        return facultyRepository.save(faculty);
    }

    public void deleteFacultyById(Long id) {

        facultyRepository.deleteById(id);
    }
}
