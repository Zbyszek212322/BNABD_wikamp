package com.example.demo.manager;

import com.example.demo.dao.SubjectRepository;
import com.example.demo.dao.entity.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SubjectManager {

    private final SubjectRepository subjectRepository;

    @Autowired
    public SubjectManager(SubjectRepository subjectRepository) {
        super();
        this.subjectRepository = subjectRepository;
    }

    public Optional<Subject> findSubjectById(Long id) {

        return subjectRepository.findById(id);
    }

    public Iterable<Subject> findAllSubjects() {

        return subjectRepository.findAll();
    }

    public Subject saveSubject(Subject subject) {

        return subjectRepository.save(subject);
    }

    public void deleteSubjectById(Long id) {

        subjectRepository.deleteById(id);
    }
}
