package com.taylormcorbin.studentregistry.service;

import com.taylormcorbin.studentregistry.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}