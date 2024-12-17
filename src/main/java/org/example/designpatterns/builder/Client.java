package org.example.designpatterns.builder;

public class Client {
    public static void main(String[] args) {
//        Builder builder = new Builder();

//        Builder builder = Student.getBuilder();
//        builder.setName("Abhishek");
//        builder.setAge(25);
//        builder.setCompany("Google");
//
//        Student student = builder.build();


        Student student = Student.getBuilder()
                                 .setName("Abhishek")
                                 .setAge(25)
                                 .setCompany("Google")
                                 .build();

        // Student student1 = new Student(null);

        System.out.println("DEBUG");
    }
}
