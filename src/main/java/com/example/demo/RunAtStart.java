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
        Employee emp6 = employeeRepository.save(new Employee(5L, " Patryk", " Badowski", new BigDecimal("3383"),  LocalDate.of(1987, 1, 1), dept2));
        Employee emp7 = employeeRepository.save(new Employee(6L, " Patryk", " Badowski", new BigDecimal("3840"),  LocalDate.of(1985, 1, 1), dept1));
        Employee emp8 = employeeRepository.save(new Employee(7L, " Standford", " Dorra", new BigDecimal("3197"),  LocalDate.of(1998, 1, 1), dept2));
        Employee emp9 = employeeRepository.save(new Employee(8L, " Lacy", " Schoenleiter", new BigDecimal("3148"),  LocalDate.of(1985, 1, 1), dept1));
        Employee emp10 = employeeRepository.save(new Employee(9L, " Osbor", " Humphrey", new BigDecimal("3492"),  LocalDate.of(1983, 1, 1), dept2));
        Employee emp11 = employeeRepository.save(new Employee(10L, " Wells", " Leak", new BigDecimal("3027"),  LocalDate.of(1988, 1, 1), dept1));
        Employee emp12 = employeeRepository.save(new Employee(11L, " Bowie", " Hentze", new BigDecimal("3049"),  LocalDate.of(1991, 1, 1), dept2));
        Employee emp13 = employeeRepository.save(new Employee(12L, " Joshia", " Condo", new BigDecimal("3438"),  LocalDate.of(1982, 1, 1), dept1));
        Employee emp14 = employeeRepository.save(new Employee(13L, " Barnett", " Loto", new BigDecimal("3302"),  LocalDate.of(1992, 1, 1), dept2));
        Employee emp15 = employeeRepository.save(new Employee(14L, " Averil", " ODougherty", new BigDecimal("3091"),  LocalDate.of(1991, 1, 1), dept1));
        Employee emp16 = employeeRepository.save(new Employee(15L, " Mozelle", " Collough", new BigDecimal("3798"),  LocalDate.of(1986, 1, 1), dept2));
        Employee emp17 = employeeRepository.save(new Employee(16L, " Westley", " Jezzard", new BigDecimal("3312"),  LocalDate.of(1986, 1, 1), dept1));
        Employee emp18 = employeeRepository.save(new Employee(17L, " Dodi", " Kemmish", new BigDecimal("3029"),  LocalDate.of(1993, 1, 1), dept2));
        Employee emp19 = employeeRepository.save(new Employee(18L, " Evanne", " Dorwood", new BigDecimal("3170"),  LocalDate.of(1995, 1, 1), dept1));
        Employee emp20 = employeeRepository.save(new Employee(19L, " Locke", " Faich", new BigDecimal("3968"),  LocalDate.of(1987, 1, 1), dept2));
        Employee emp21 = employeeRepository.save(new Employee(20L, " Pietrek", " Arrell", new BigDecimal("3947"),  LocalDate.of(1982, 1, 1), dept1));
        Employee emp22 = employeeRepository.save(new Employee(21L, " Ransell", " Skill", new BigDecimal("3491"),  LocalDate.of(1989, 1, 1), dept2));
        Employee emp23 = employeeRepository.save(new Employee(22L, " Gasparo", " Kuhnt", new BigDecimal("3038"),  LocalDate.of(1998, 1, 1), dept1));
        Employee emp24 = employeeRepository.save(new Employee(23L, " Ara", " Purdy", new BigDecimal("3461"),  LocalDate.of(1990, 1, 1), dept2));
        Employee emp25 = employeeRepository.save(new Employee(24L, " Ly", " Merrito", new BigDecimal("3757"),  LocalDate.of(2000, 1, 1), dept1));
        Employee emp26 = employeeRepository.save(new Employee(25L, " Hakim", " Sede", new BigDecimal("3328"),  LocalDate.of(1996, 1, 1), dept2));
        Employee emp27 = employeeRepository.save(new Employee(26L, " Trudy", " Fysh", new BigDecimal("3966"),  LocalDate.of(1996, 1, 1), dept1));
        Employee emp28 = employeeRepository.save(new Employee(27L, " Norry", " Rabbe", new BigDecimal("3406"),  LocalDate.of(1986, 1, 1), dept2));
        Employee emp29 = employeeRepository.save(new Employee(28L, " Amargo", " Eckersall", new BigDecimal("3052"),  LocalDate.of(1985, 1, 1), dept1));
        Employee emp30 = employeeRepository.save(new Employee(29L, " Callea", " Lumsde", new BigDecimal("3692"),  LocalDate.of(1993, 1, 1), dept2));
        Employee emp31 = employeeRepository.save(new Employee(30L, " Noel", " Brunelleschi", new BigDecimal("3509"),  LocalDate.of(1995, 1, 1), dept1));
        Employee emp32 = employeeRepository.save(new Employee(31L, " Murielle", " Cowoppe", new BigDecimal("3303"),  LocalDate.of(1989, 1, 1), dept2));

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

        Student student1 = studentRepository.save(new Student("Jerry", "Łopata"));
        Student student2 = studentRepository.save(new Student("Jan", "Nowak"));
        Student student3 = studentRepository.save(new Student("Wiley", "Lomis"));
        Student student4 = studentRepository.save(new Student("Morgan", "Sallows"));
        Student student5 = studentRepository.save(new Student("Erma", "Eddowes"));
        Student student6 = studentRepository.save(new Student("Ham", "Maingot"));
        Student student7 = studentRepository.save(new Student("Panchito", "Cassidy"));
        Student student8 = studentRepository.save(new Student("Ruddie", "Leacock"));
        Student student9 = studentRepository.save(new Student("Rory", "Coh"));
        Student student10 = studentRepository.save(new Student("Celie", "Langsbury"));
        Student student11 = studentRepository.save(new Student("Marrilee", "Winterscale"));
        Student student12 = studentRepository.save(new Student("Flin", "Fora"));
        Student student13 = studentRepository.save(new Student("Sergei", "McIndrew"));
        Student student14 = studentRepository.save(new Student("Hashim", "Hall-Gough"));
        Student student15 = studentRepository.save(new Student("Frayda", "Purves"));
        Student student16 = studentRepository.save(new Student("Hollie", "Hargitt"));
        Student student17 = studentRepository.save(new Student("Ardelle", "Deniset"));
        Student student18 = studentRepository.save(new Student("Barde", "Messer"));
        Student student19 = studentRepository.save(new Student("Fergus", "Hutte"));
        Student student20 = studentRepository.save(new Student("Buck", "McHugh"));
        Student student21 = studentRepository.save(new Student("Michele", "McEntegart"));
        Student student22 = studentRepository.save(new Student("Guilbert", "Deverale"));
        Student student23 = studentRepository.save(new Student("Chicky", "Galfour"));
        Student student24 = studentRepository.save(new Student("Clemmy", "Spratt"));
        Student student25 = studentRepository.save(new Student("Myra", "Keher"));
        Student student26 = studentRepository.save(new Student("Dominga", "Filgate"));
        Student student27 = studentRepository.save(new Student("Caterina", "Westley"));
        Student student28 = studentRepository.save(new Student("Tomas", "Kelleway"));
        Student student29 = studentRepository.save(new Student("Gustavo", "Parsisso"));
        Student student30 = studentRepository.save(new Student("Atalanta", "Giovannacci"));
        Student student31 = studentRepository.save(new Student("Gregoor", "Blackde"));
        Student student32 = studentRepository.save(new Student("Verna", "Heito"));
        Student student33 = studentRepository.save(new Student("Isacco", "Nicolls"));
        Student student34 = studentRepository.save(new Student("Say", "Woodcroft"));
        Student student35 = studentRepository.save(new Student("Brennen", "Grimmett"));
        Student student36 = studentRepository.save(new Student("Amara", "Carlile"));
        Student student37 = studentRepository.save(new Student("Galina", "OFergus"));
        Student student38 = studentRepository.save(new Student("Ashlin", "Overill"));
        Student student39 = studentRepository.save(new Student("Glendon", "Borth"));
        Student student40 = studentRepository.save(new Student("Gabriell", "Flounders"));
        Student student41 = studentRepository.save(new Student("Devora", "Cortnay"));


        Faculty faculty1 = facultyRepository.save(new Faculty(1L, "Computer Science"));
        Faculty faculty2 = facultyRepository.save(new Faculty(2L, "Business Studies"));
        Faculty faculty3 = facultyRepository.save(new Faculty(3L, "Architecture"));


    }
}
