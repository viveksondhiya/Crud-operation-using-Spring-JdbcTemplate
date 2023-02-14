package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program is Started now" );
     
        ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
        
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
           
        
        
       // Student student=new Student();
      //Performing Insertion Operation
//        student.setId(103);
//        student.setName("Rohan Nishad");
//        student.setCity("Pune");
//        int result = studentDao.insert(student);
//        System.out.println("Number of row affected :" + result);
        
        //Performing update operation
        
//        student.setId(102);
//        student.setName("Mohit Bhusal");
//        student.setCity("Delhi");
//        int result = studentDao.change(student);
//        System.out.println("Number of row affected :" + result);
        
        //Performing Delete operation 
        
//        int result = studentDao.delete(102);
//        System.out.println("Number of rows affected :" + result);
        
        //Performing seleting operation
        
//        Student student=studentDao.getStudent(101);
//        System.out.println(student);
        
        //List out multiple objects
        
        List<Student> student=studentDao.getAllStudent();
        for(Student s : student) {
        	System.out.println(s);
        }
        
    }
}
