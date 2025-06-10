package com.recorder.demo.converter;


import com.recorder.demo.dao.Student;
import com.recorder.demo.dto.StudentDTO;

public class StudentConverter {

    public static StudentDTO convertStudent(Student student){
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getId());
        studentDTO.setEmail(student.getEmail());
        studentDTO.setName(student.getName());
        return studentDTO;
    }

    public static Student convertStudent(StudentDTO studentDTO){
        Student student = new Student();
        student.setEmail(studentDTO.getEmail());
        student.setName(studentDTO.getName());
        //student.setAge(studentDTO.getA); age not yet set in dto
        return student;
    }
}
