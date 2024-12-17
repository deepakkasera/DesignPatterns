package org.example.designpatterns.builder;

public class Student {
    private String name;
    private int age;
    private String company;
    private double psp;
    private String batch;

    private Student(Builder builder) {
        this.name = builder.getName();
        this.age = builder.getAge();
        this.company = builder.getCompany();
        this.batch = builder.getBatch();
    }

    public static Builder getBuilder() {
        ///Static method can only access static attribute of the class.
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public static class Builder { // Inner class.
        private String name;
        private int age;
        private String company;
        private double psp;
        private String batch;

        public Student build() {
            //validations start
            if (this.getAge() < 18) {
                throw new RuntimeException("Age can't be less than 18");
            }
            //validations end

            return new Student(this);
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getCompany() {
            return company;
        }

        public Builder setCompany(String company) {
            this.company = company;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }
    }
}
