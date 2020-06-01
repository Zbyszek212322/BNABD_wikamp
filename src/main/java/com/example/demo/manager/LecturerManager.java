package com.example.demo.manager;

import com.example.demo.dao.LecturerRepository;
import com.example.demo.dao.entity.Lecturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LecturerManager {

    private final LecturerRepository lecturerRepository;

    @Autowired
    public LecturerManager(LecturerRepository lecturerRepository) {
        super();
        this.lecturerRepository = lecturerRepository;
    }

    public Optional<Lecturer> findLecturerById(Long id) {

        return lecturerRepository.findById(id);
    }

    public Iterable<Lecturer> findAllLecturers() {

        return lecturerRepository.findAll();
    }

    public Lecturer saveLecturer(Lecturer lecturer) {

        return lecturerRepository.save(lecturer);
    }

    public void deleteLecturerById(Long id) {

        lecturerRepository.deleteById(id);
    }
}
