package com.telusko.springjdbc;

import com.telusko.springjdbc.Model.Student;
import com.telusko.springjdbc.Service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringjdbcApplication {

    public static void main(String[] args) {
        ApplicationContext context= SpringApplication.run(SpringjdbcApplication.class, args);
        Student s=context.getBean(Student.class);
        StudentService service=context.getBean(StudentService.class);
        service.addStudent(s);
        List<Student> students=service.getStudents();
        System.out.println(students);
    }

}
