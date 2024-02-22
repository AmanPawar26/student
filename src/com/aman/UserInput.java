package com.aman;

import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String name;
        int rollNo;
        String year;
        char div;
        float grades;
        float attendance;
        long mobileNo;
        int age;
        String gender;
        String email;
        String dob;
        String address;
        String enrollmentDate;
        String parentName;

        System.out.println("Enter your name");
        name = obj.nextLine();

        System.out.println("Enter your Roll Number");
        rollNo = obj.nextInt();
        obj.nextLine(); // Consume newline character

        System.out.println("Enter your current year");
        year = obj.nextLine();

        System.out.println("Enter your div");
        div = obj.next().charAt(0);

        System.out.println("Enter your grades");
        grades = obj.nextFloat();

        System.out.println("Enter your attendance");
        attendance = obj.nextFloat();

        System.out.println("Enter your mobile number");
        mobileNo = obj.nextLong();
        obj.nextLine(); // Consume newline character

        System.out.println("Enter your age");
        age = obj.nextInt();
        obj.nextLine(); // Consume newline character

        System.out.println("Enter your gender");
        obj.nextLine(); // Consume newline character
        gender = obj.nextLine();

        System.out.println("Enter your email");
        email = obj.nextLine();

        System.out.println("Enter your dob");
        dob = obj.nextLine();

        System.out.println("Enter your address");
        address = obj.nextLine();

        System.out.println("Enter your enrollment date");
        enrollmentDate = obj.nextLine();

        System.out.println("Enter your parent name");
        parentName = obj.nextLine();

        // printing the output
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Year: " + year);
        System.out.println("Div: " + div);
        System.out.println("Grades: " + grades);
        System.out.println("Attendance: " + attendance);
        System.out.println("Mobile Number: " + mobileNo);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Email: " + email);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Address: " + address);
        System.out.println("Enrollment Date: " + enrollmentDate);
        System.out.println("Parent Name: " + parentName);
    }
}
