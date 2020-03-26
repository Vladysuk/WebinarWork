package ua.lviv.iot.spring.first.rest.model;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    private String firstName;
    private String lastName;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public Student(){}
    public Student(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public Student(String firstName, String lastName){
        this(firstName, lastName, 0);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}