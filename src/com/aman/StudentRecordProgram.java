package com.aman;
import java.util.Scanner;
public class StudentRecordProgram {
    public static void main(String[] args) {
        enterStudentRecord();
    }

    public static void enterStudentRecord() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Student Record? (Y/N): ");
            String choice = scanner.nextLine().trim().toUpperCase();

            if (choice.equals("Y")) {
                // Proceed to enter details
                System.out.print("Enter student name: ");
                String studentName = scanner.nextLine();

                System.out.print("Enter student rollNo: ");
                int studentRollNo = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter student year: ");
                String studentYear = scanner.nextLine();

                System.out.print("Enter student div: ");
                char studentDiv = scanner.next().charAt(0);
                scanner.nextLine();

                System.out.print("Enter student grades: ");
                float studentGrades = scanner.nextFloat();
                scanner.nextLine();

                System.out.print("Enter student attendance: ");
                float studentAttendance = scanner.nextFloat();
                scanner.nextLine();


                System.out.print("Enter student mobileNo: ");
                long studentMobileNo = scanner.nextLong();
                scanner.nextLine();

                System.out.print("Enter student age: ");
                int studentAge = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                System.out.print("Enter student gender: ");
                String studentGender = scanner.nextLine();

                System.out.print("Enter student email: ");
                String studentEmail = scanner.nextLine();

                System.out.print("Enter student dob: ");
                String studentDOB = scanner.nextLine();

                System.out.print("Enter student address: ");
                String studentAddress = scanner.nextLine();


                System.out.print("Enter student enrollment date: ");
                String studentenrollmentDate = scanner.nextLine();

                System.out.print("Enter student parent name: ");
                String studentparentName = scanner.nextLine();


                System.out.print("Do you want to continue? (Y/N): ");
                choice = scanner.nextLine().trim().toUpperCase();

                if (!choice.equals("Y")) {
                    System.out.println("Exiting...");
                    break; // Exit the loop
                }
            } else if (choice.equals("N")) {
                System.out.println("Exiting...");
                break; // Exit the loop
            } else {
                System.out.println("Invalid choice. Please enter Y or N.");
            }
        }

        scanner.close();
    }
}

