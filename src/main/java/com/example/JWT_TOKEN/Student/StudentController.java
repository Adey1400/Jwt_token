package com.example.JWT_TOKEN.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController {

    public List<Student> students = new ArrayList<>(List.of(
            new Student(1, "Rahul Sharma", 85),
            new Student(2, "Ananya Singh", 92),
            new Student(3, "Amit Verma", 76),
            new Student(4, "Priya Das", 88),
            new Student(5, "Kunal Roy", 69)));

    @GetMapping("/students")
    public List<Student> getStudent() {
        return students;
    }
    
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        students.add(student);
        return student;
    }
    
    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }
}
