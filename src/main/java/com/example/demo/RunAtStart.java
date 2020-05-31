package com.example.demo;

import com.example.demo.dao.*;
import com.example.demo.dao.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Component
public class RunAtStart {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private StudentRepository studentRepository;

    @PostConstruct
    public void runAtStart() {

        Department dept1 = departmentRepository.save(new Department("Finances"));
        Department dept2 = departmentRepository.save(new Department("Production"));

        Employee emp1 = employeeRepository.save(new Employee(1L, "Euzebiusz", "Nowacki", new BigDecimal("4000.50"),
                LocalDate.of(1999, 1, 1), dept1));
        Employee emp2 = employeeRepository.save(new Employee(2L, "Eugeniusz", "Nowak", new BigDecimal("1000.00"),
                LocalDate.of(1997, 1, 1), dept2));
        Employee emp3 = employeeRepository.save(new Employee(3L, "Jan", "Wiśniewski", new BigDecimal("2500.00"),
                LocalDate.of(1998, 1, 1), dept2));
        Employee emp4 = employeeRepository.save(new Employee(4L, "Kamil", "Wiśniewski", new BigDecimal("2800.00"),
                LocalDate.of(2001, 1, 1), dept2));

        Role role1 = roleRepository.save(new Role(EnumRole.ROLE_USER));
        Role role2 = roleRepository.save(new Role(EnumRole.ROLE_ADMIN));

        Set<Role> user = new HashSet<>(Arrays.asList(role1));
        Set<Role> admin = new HashSet<>(Arrays.asList(role2));

        User user1 = userRepository.save(new User(1L, "admin1", "admin1@test.pl",
                "$2a$10$zWasY5baOMAK/ffCBBUvZ.jxHyp47WQqBbPw/kwF/e.rTj11xJcMe", admin));
        User user2 = userRepository.save(new User(2L, "user1", "user1@test.pl",
                "$2a$10$zWasY5baOMAK/ffCBBUvZ.jxHyp47WQqBbPw/kwF/e.rTj11xJcMe", user));

        Student student1 = studentRepository.save(new Student("Jerry", "Łopata"));
        Student student2 = studentRepository.save(new Student("Jan", "Nowak"));
    }
}
