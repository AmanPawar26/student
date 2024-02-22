package com.aman;

public class Student {
    private String name;
    private int rollNo;
    private String year;
    private char div;
    private float grades;
    private float attendance;
    private long mobileNo; // Changed type to long
    private int age;
    private String gender;
    private String email;
    private String dob;
    private String address;
    private String enrollmentdate;
    private String parentname;

    // Constructor
    public Student(String name, int rollNo, String year, char div, float grades, float attendance, long mobileNo, int age, String gender, String email, String dob, String address, String enrollmentdate, String parentname) {
        this.name = name;
        this.rollNo = rollNo;
        this.year = year;
        this.div = div;
        this.grades = grades;
        this.attendance = attendance;
        this.mobileNo = mobileNo;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.dob = dob;
        this.address = address;
        this.enrollmentdate = enrollmentdate;
        this.parentname = parentname;
    }



    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for rollNo
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // Getter and Setter for year
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    // Getter and Setter for div
    public char getDiv() {
        return div;
    }

    public void setDiv(char div) {
        this.div = div;
    }

    // Getter and Setter for grades
    public float getGrades() {
        return grades;
    }

    public void setGrades(float grades) {
        this.grades = grades;
    }

    // Getter and Setter for attendance
    public float getAttendance() {
        return attendance;
    }

    public void setAttendance(float attendance) {
        this.attendance = attendance;
    }

    // Getter and Setter for mobileNo
    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter for gender
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Getter and Setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and Setter for dob
    public String getDOB() {
        return dob;
    }

    public void setDOB(String dob) {
        this.dob = dob;
    }

    // Getter and Setter for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getter and Setter for enrollmentdate
    public String getEnrollmentDate() {
        return enrollmentdate;
    }

    public void setEnrollmentDate(String enrollmentdate) {
        this.enrollmentdate = enrollmentdate;
    }

    // Getter and Setter for parentname
    public String getParentName() {
        return parentname;
    }

    public void setParentName(String parentname) {
        this.parentname = parentname;
    }
}


