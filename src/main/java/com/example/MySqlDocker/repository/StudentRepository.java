package com.example.MySqlDocker.repository;

import com.example.MySqlDocker.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

}
