package com.homeworkexcercise2;

public class Address {
    private String streetName;
    private int streetNumber;

    private Student student;

    public Address(){}

    public Address(int streetNumber, String streetName, Student student) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.student = student;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Address to be send: " + this.streetName + "number: " + this.streetNumber + "\n"
                + this.student.toString();

    }
}