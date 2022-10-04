package com.homeworkexcercise2;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"firstName", "lastName", "address", "email", "phoneNumber", "university", "index", "credits"})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Student {

    private String firstName;
    private String lastName;
    private int index;
    private String address;
    private String email;
    private int phoneNumber;
    private String university;
    @JsonIgnore
    private int credits;

    public Student() {
    }

    public Student(String firstName, String lastName, int index, String address, String email, int phoneNumber, String university, int credits) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.index = index;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.university = university;
        this.credits = credits;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Information about student: " + this.firstName + " " + this.lastName + ", with address: " + this.address + ", e-mail:" + this.email + " and phone number: " + this.phoneNumber + " as a student at " + this.university + " with index number: " + this.index;
    }
}
