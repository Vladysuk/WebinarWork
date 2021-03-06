package ua.lviv.iot.spring.first.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.spring.first.dataaccess.StudentRepository;
import ua.lviv.iot.spring.first.rest.model.Student;

import java.awt.*;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student createStudent(Student student){
        return studentRepository.save(student);
    }

    public  Student updateStudent(Student student, String id){
        String query="select * from students where id = :id\n";
        String finalQuery = query+id;
        return null;
    }

    public List findAll(){
        return (List) studentRepository.findAll();
    }

}
