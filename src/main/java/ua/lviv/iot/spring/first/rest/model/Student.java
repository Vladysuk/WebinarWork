package ua.lviv.iot.spring.first.rest.model;

public class Student {
    private String firstName;
    private String lastName;
    private int id;

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