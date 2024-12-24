package org.example.designpatterns.prototype;

public class Client {
    private static void fillRegistry(StudentRegistry studentRegistry) {
        Student student = new Student();
        student.setUniversity("Scaler Academy");

        studentRegistry.put("student", student);

        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.setIq(160);
        studentRegistry.put("intelligentStudent", intelligentStudent);
    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student deepak = studentRegistry.get("student").copy();
        deepak.setName("Deepak");

        Student nikhil = studentRegistry.get("student").copy();
        nikhil.setName("Nikhil");

        Student vishal = studentRegistry.get("intelligentStudent").copy();
        vishal.setName("Vishal");

        System.out.println("DEBUG");
    }
}
