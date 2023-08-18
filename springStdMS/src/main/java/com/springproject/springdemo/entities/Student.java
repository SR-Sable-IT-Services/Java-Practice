package com.springproject.springdemo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentId;

    private String name;
    private String dob;
    private String gender;
    private String email;
    private String address;
    private String school;

    public Student() {
    }

    public Student(String name, String dob, String gender, String email, String address, String school) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.school = school;
    }
    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", dob=" + dob + ", gender=" + gender + ", email="
				+ email + ", address=" + address + ", school=" + school + "]";
	}
    

}