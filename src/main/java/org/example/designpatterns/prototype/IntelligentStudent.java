package org.example.designpatterns.prototype;

public class IntelligentStudent extends Student {
    private int iq;

    public IntelligentStudent() {}

    public IntelligentStudent(IntelligentStudent student) {
        super(student);
        this.iq = student.iq;
    }

    @Override
    public IntelligentStudent copy() {
        return new IntelligentStudent(this);
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
