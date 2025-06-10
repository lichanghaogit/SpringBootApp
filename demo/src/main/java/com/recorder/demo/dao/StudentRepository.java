package com.recorder.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    //not need to manually write except complex requirements
    List<Student> findByEmail(String email);
}
