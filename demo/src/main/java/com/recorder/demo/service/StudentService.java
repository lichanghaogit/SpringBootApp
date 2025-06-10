package com.recorder.demo.service;

import com.recorder.demo.dto.StudentDTO;


public interface StudentService {
    StudentDTO getStudentById(long id);

    Long addNewStudent(StudentDTO studentDTO);

    void deleteStudentById(long id);

    StudentDTO updateStudentById(long id, String name, String email);
    //public Student getStudentById(long id);

}
