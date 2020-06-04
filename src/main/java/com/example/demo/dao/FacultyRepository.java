package com.example.demo.dao;

import com.example.demo.dao.entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Long> {

    Faculty findByFacultyName(String facultyName);
    Faculty findFirstById(Long facultyId);
}
