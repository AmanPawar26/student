package com.aman;

public class Main {
    // Display method inside the Main class
    public static void display(Student[] students) {
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Roll Number: " + student.getRollNo());
            System.out.println("Year: " + student.getYear());
            System.out.println("Div: " + student.getDiv());
            System.out.println("Grades: " + student.getGrades());
            System.out.println("Attendance: " + student.getAttendance());
            System.out.println("Mobile Number: " + student.getMobileNo());
            System.out.println("Age: " + student.getAge());
            System.out.println("Gender: " + student.getGender());
            System.out.println("Email: " + student.getEmail());
            System.out.println("Date of Birth: " + student.getDOB());
            System.out.println("Address: " + student.getAddress());
            System.out.println("Enrollment Date: " + student.getEnrollmentDate());
            System.out.println("Parent Name: " + student.getParentName());
            System.out.println(); // Add a line break between each student's details
        }
    }

    // Display2 method inside the Main class
    public static void display2(Student[] students) {
        for (Student student : students) {
            String data ="John,11,TE,A";
            String[] items = data.split(",");
            System.out.print("Name: "  + student.getName() + ",");
            System.out.print("Roll Number: "  + student.getRollNo() + ",");
            System.out.print("Year: "  + student.getYear() + ",");
            System.out.print("Div: "  + student.getDiv() + ",");
            System.out.println(); // Add a line break between each student's details
        }
    }




    public static void setupStudentData() {
        Student[] students = new Student[16];
        students[0] = new Student("Jitesh", 56, "FE", 'B', 9.23f, 78.98f, 8097990396L, 18, "Male", "jiteshappygai507@gmail.com", "2005-12-07", "Ghatkopar", "2023-08-14", "Raju Gaikwad");
        students[1] = new Student("Abhishek Wali", 48, "FE", 'A', 8.12f, 90.9f, 8010029214L, 18, "Male", "abhishekwali555@gmail.com", "2005-05-05", "Nerul", "2023-08-05", "Ameet Wali" );
        students[2] = new Student("Ayush Shewale", 54, "FE", 'A', 7.51f, 89.76f, 7385534825L, 18, "Male", "ayushshewale2005@gmail.com", "2005-09-29", "Thane", "2023-08-05", "Dadsaheb Shewale");
        students[3] = new Student("Shubham Banekar", 27, "FE", 'B', 9.79f, 69.43f, 8850798082L, 18, "Male", "shubham.banekar@vit.edu.in", "2005-07-22", "Andheri", "2023-08-13", "Sandeep Banekar");
        students[4] = new Student("Sanskruti Jadhavar", 46, "SE", 'B', 9.59f, 89.00f, 9004550255L, 20, "Female", "sanskrutij387@gmail.com", "2004-01-04", "Kalyan", "2023-12-21", "Madhavi Jadhavar");
        students[5] = new Student("Nishad Jadhav", 26, "SE", 'B', 6.59f, 85.00f, 9004580255L, 20, "Male", "nishadj87@gmail.com", "2004-05-04", "Wadala", "2023-12-11", "Madhavi Jadhav");
        students[6] = new Student("Manas Phanase", 1, "SE", 'A', 7.59f, 76.30f, 8004550255L, 20, "Male", "manasphanse07@gmail.com", "2004-11-24", "Dadar", "2023-12-08", "Kedar Phanase");
        students[7] = new Student("Soham Chari", 13, "SE", 'A', 5.89f, 85.40f, 7004550255L, 20, "Male", "charisoham44@gmail.com", "2004-04-04", "Bhandup", "2022-12-18", "Sakharam Chari");
        students[8] = new Student("Sanskruti Jadhavar", 46, "TE", 'B', 6.59f, 85.00f, 9004550255L, 20, "Female", "sanskrutij387@gmail.com", "2004-01-04", "Kalyan", "2021-12-21", "Madhavi Jadhavar");
        students[9] = new Student("Sahil Datar",  6, "TE", 'A', 8.54f, 96.23f, 8879736319L, 20, "Male", "SAHILKDATAR@GMAIL.COM", "2003-06-20",  "Dombivli", "2021-12-02",  "Kedar Datar");
        students[10] = new Student("Aman Pawar", 30, "TE", 'A', 8.95f, 90.65f, 7264949180L, 20, "Male", "amanrpxx@gmail.com", "2003-02-26", "Wadala", "2021-12-22", "Raju Pawar");
        students[11] = new Student("Vinayakash Thevar", 65, "TE", 'B', 8.86f, 96.78f, 8591982779L, 20, "Male", "vinay66@gmail.com", "2003-09-09", "Wadala", "2021-12-27", "Sargunam Thevar");
        students[12] = new Student("Pankaj Ingle", 77, "BE", 'A', 8.56f, 77.34f, 9021267298L, 21, "Male", "inglepankaj555@gmail.com", "2002-09-29", "Malad", "2020-12-23", "Arun Ingle");
        students[13] = new Student("Ananthakrishnan Nair", 7, "BE", 'B', 8.93f, 77.12f, 9029522574L, 21, "Male", "ananthakrishnannair120@gmail.com", "2002-06-21", "Kalyan", "2020-12-18", "Ajithkumar Nair");
        students[14] = new Student("Aditya Maluskar", 15, "BE", 'A', 9.70f, 65.89f, 7517518052L, 21, "Male", "aditya.maluskar@vit.edu.in", "2001-02-12", "Wadala", "2020-12-06", "Dnyaneshwar Maluskar");
        students[15] = new Student("Prathmesh Jain", 37, "BE", 'B', 9.14f, 86.89f, 8657376595L, 21, "Male", "pratsspam22@gmail.com", "2002-05-22", "Charni Road", "2021-01-29", "Mahendra Jain");

        // Displaying details of 16 students
        display(students);
        display2(students);

    }


    public static void main(String[] args) {

        setupStudentData();

    }
}

