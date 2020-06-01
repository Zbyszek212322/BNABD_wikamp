package com.example.demo.manager;

import com.example.demo.dao.GradeRepository;
import com.example.demo.dao.entity.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GradeManager {

    private final GradeRepository gradeRepository;

    @Autowired
    public GradeManager(GradeRepository gradeRepository) {
        super();
        this.gradeRepository = gradeRepository;
    }

    public Optional<Grade> findGradeById(Long id) {

        return gradeRepository.findById(id);
    }

    public Iterable<Grade> findAllGrades() {

        return gradeRepository.findAll();
    }

    public Grade saveGrade(Grade grade) {

        return gradeRepository.save(grade);
    }

    public void deleteGradeById(Long id) {

        gradeRepository.deleteById(id);
    }
}
