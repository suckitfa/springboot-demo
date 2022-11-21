package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        List<Student> res = new ArrayList<>();
        Student student = new Student(
                1l,
                "bob",
                "shit2@gmail.com",
                LocalDate.of(2000, Month.JANUARY,5),
                21
        );
        res.add(student);
        return res;
    }
}
