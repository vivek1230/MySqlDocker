package com.example.MySqlDocker.controller;

import com.example.MySqlDocker.entity.StudentEntity;
import com.example.MySqlDocker.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@Slf4j
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/findAll")
    public List<StudentEntity> getAllStudent(){
        log.info("findAll");
        List<StudentEntity> studentEntityList = studentRepository.findAll();
        log.info("studentEntityList: {}", studentEntityList);
        return studentEntityList;
    }

    @PostMapping("/addStudent")
    public StudentEntity addStudent(@RequestBody StudentEntity studentEntity){
        log.info("addStudent");
        StudentEntity student = studentRepository.save(studentEntity);
        log.info("student: {}", student);
        return student;
    }
}
