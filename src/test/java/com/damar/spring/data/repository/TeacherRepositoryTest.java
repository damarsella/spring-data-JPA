package com.damar.spring.data.repository;

import com.damar.spring.data.entity.Course;
import com.damar.spring.data.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void saveTeacher() {

        Course courseAlgoritma = Course.builder()
                .title("Algoritma")
                .credit(5)
                .build();

        Course courseJava = Course.builder()
                .title("Java")
                .credit(6)
                .build();

        Teacher teacher = Teacher.builder()
                .firstName("Naila")
                .lastName("Wasahua")
//                .courses(List.of(courseAlgoritma, courseJava))
                .build();

        teacherRepository.save(teacher);

        System.out.println("teacher = " + teacher);

    }

}