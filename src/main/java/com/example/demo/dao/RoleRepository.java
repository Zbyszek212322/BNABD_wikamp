package com.example.demo.dao;

import com.example.demo.dao.entity.EnumRole;
import com.example.demo.dao.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(EnumRole name);
}
