package studentmanagement;

import data.Student;

import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {
        inputAStudent();
    }

    /**
     * 
     */
    public static void inputAStudent() {
        String id, name, call;
        double gpa;

        while (true) {

            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Id = ");
                id = sc.nextLine();
                System.out.print("Name = ");

                name = sc.nextLine();
                System.out.print("GPA = ");

                gpa = sc.nextDouble();
                Student x = new Student(id, name, gpa);
                x.showProfile();
                System.out.println("\n");

                System.out.print("Do u want to do again --- Y/N : ");
                call = sc.nextLine();
                System.out.print("Do u want to do again --- Y/N : ");

                break;

            }

        }

    }
}
