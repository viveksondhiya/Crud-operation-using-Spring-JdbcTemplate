package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entities.Student;

public interface StudentDao {
   //insert operation method
   public int insert(Student student);
   //update method
   public int change(Student student);
   //delete method
   public int delete(int studentId);
   //Selecting or retrieving method
   public Student getStudent(int studentId);
   //selecting list of obejcts
   public List<Student> getAllStudent();
}
