package org.example.designpatterns.prototype;

public class Student implements Prototype<Student> {
    private String name;
    private int age;
    private String university;
    private double psp;

    public Student() {}

    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.university = student.university;
        this.psp = student.psp;
    }

    @Override
    public Student copy() {
        return new Student(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }
}
