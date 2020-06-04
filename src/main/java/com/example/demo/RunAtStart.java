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

    @Autowired
    private FacultyRepository facultyRepository;

    @Autowired
    private GradeRepository gradeRepository;

    @Autowired
    private LecturerRepository lecturerRepository;

    @Autowired
    private SubjectRepository subjectRepository;

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

        // ---------------------------------------------------------------------------------------------------------

        Role role1 = roleRepository.save(new Role(EnumRole.ROLE_USER));
        Role role2 = roleRepository.save(new Role(EnumRole.ROLE_ADMIN));
        Role role3 = roleRepository.save(new Role(EnumRole.ROLE_STUDENT));
        Role role4 = roleRepository.save(new Role(EnumRole.ROLE_LECTURER));

        Set<Role> user = new HashSet<>(Arrays.asList(role1));
        Set<Role> admin = new HashSet<>(Arrays.asList(role2));
        Set<Role> student = new HashSet<>(Arrays.asList(role3));
        Set<Role> lecturer = new HashSet<>(Arrays.asList(role4));

        User user1 = userRepository.save(new User(1L, "admin1", "admin1@test.pl",
                "$2a$10$zWasY5baOMAK/ffCBBUvZ.jxHyp47WQqBbPw/kwF/e.rTj11xJcMe", admin));
        User user2 = userRepository.save(new User(2L, "user1", "user1@test.pl",
                "$2a$10$zWasY5baOMAK/ffCBBUvZ.jxHyp47WQqBbPw/kwF/e.rTj11xJcMe", user));
        User user3 = userRepository.save(new User(3L, "student1", "student1@test.pl",
                "$2a$10$zWasY5baOMAK/ffCBBUvZ.jxHyp47WQqBbPw/kwF/e.rTj11xJcMe", student));
        User user4 = userRepository.save(new User(4L, "lecturer1", "lecturer1@test.pl",
                "$2a$10$zWasY5baOMAK/ffCBBUvZ.jxHyp47WQqBbPw/kwF/e.rTj11xJcMe", lecturer));

        Faculty faculty1 = facultyRepository.save(new Faculty(1L, "Computer Science"));
        Faculty faculty2 = facultyRepository.save(new Faculty(2L, "Business Studies"));
        Faculty faculty3 = facultyRepository.save(new Faculty(3L, "Architecture"));

        Student student1 = studentRepository.save(new Student("Jerry", "Łopata", faculty1));
        Student student2 = studentRepository.save(new Student("Jan", "Nowak", faculty1));
        Student student3 = studentRepository.save(new Student("Wiley", "Lomis", faculty1));
        Student student4 = studentRepository.save(new Student("Morgan", "Sallows", faculty1));
        Student student5 = studentRepository.save(new Student("Erma", "Eddowes", faculty1));
        Student student6 = studentRepository.save(new Student("Ham", "Maingot", faculty1));
        Student student7 = studentRepository.save(new Student("Panchito", "Cassidy", faculty1));
        Student student8 = studentRepository.save(new Student("Ruddie", "Leacock", faculty1));
        Student student9 = studentRepository.save(new Student("Rory", "Coh", faculty1));
        Student student10 = studentRepository.save(new Student("Celie", "Langsbury", faculty1));
        Student student11 = studentRepository.save(new Student("Marrilee", "Winterscale", faculty2));
        Student student12 = studentRepository.save(new Student("Flin", "Fora", faculty2));
        Student student13 = studentRepository.save(new Student("Sergei", "McIndrew", faculty2));
        Student student14 = studentRepository.save(new Student("Hashim", "Hall-Gough", faculty2));
        Student student15 = studentRepository.save(new Student("Frayda", "Purves", faculty2));
        Student student16 = studentRepository.save(new Student("Hollie", "Hargitt", faculty2));
        Student student17 = studentRepository.save(new Student("Ardelle", "Deniset", faculty2));
        Student student18 = studentRepository.save(new Student("Barde", "Messer", faculty2));
        Student student19 = studentRepository.save(new Student("Fergus", "Hutte", faculty2));
        Student student20 = studentRepository.save(new Student("Buck", "McHugh", faculty2));
        Student student21 = studentRepository.save(new Student("Michele", "McEntegart", faculty2));
        Student student22 = studentRepository.save(new Student("Guilbert", "Deverale", faculty2));
        Student student23 = studentRepository.save(new Student("Chicky", "Galfour", faculty2));
        Student student24 = studentRepository.save(new Student("Clemmy", "Spratt", faculty2));
        Student student25 = studentRepository.save(new Student("Myra", "Keher", faculty2));
        Student student26 = studentRepository.save(new Student("Dominga", "Filgate", faculty2));
        Student student27 = studentRepository.save(new Student("Caterina", "Westley", faculty2));
        Student student28 = studentRepository.save(new Student("Tomas", "Kelleway", faculty2));
        Student student29 = studentRepository.save(new Student("Gustavo", "Parsisso", faculty3));
        Student student30 = studentRepository.save(new Student("Atalanta", "Giovannacci", faculty3));
        Student student31 = studentRepository.save(new Student("Gregoor", "Blackde", faculty3));
        Student student32 = studentRepository.save(new Student("Verna", "Heito", faculty3));
        Student student33 = studentRepository.save(new Student("Isacco", "Nicolls", faculty3));
        Student student34 = studentRepository.save(new Student("Say", "Woodcroft", faculty3));
        Student student35 = studentRepository.save(new Student("Brennen", "Grimmett", faculty3));
        Student student36 = studentRepository.save(new Student("Amara", "Carlile", faculty3));
        Student student37 = studentRepository.save(new Student("Galina", "OFergus", faculty3));
        Student student38 = studentRepository.save(new Student("Ashlin", "Overill", faculty3));
        Student student39 = studentRepository.save(new Student("Glendon", "Borth", faculty3));
        Student student40 = studentRepository.save(new Student("Gabriell", "Flounders", faculty3));
        Student student41 = studentRepository.save(new Student("Devora", "Cortnay", faculty3));



    }
}
