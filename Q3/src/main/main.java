package main;

import data.Employee;
import data.EmployeeList;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int idE,k;

        String nameE;
        double salaryE;
        EmployeeList emplyees = new EmployeeList();
        
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter the number of employees: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("Enter id: ");
            idE = Integer.parseInt(sc.nextLine());
            //idE=sc.nextInt();
            System.out.print("Enter name: ");
            nameE = sc.nextLine();
            System.out.print("Enter salary: ");
            salaryE = Double.parseDouble(sc.nextLine());
            Employee worker = new Employee(idE, nameE, salaryE);
            emplyees.add(worker);

        }
        while (true) {
            System.out.print("\n1/ Test getNameById()");
            System.out.print("\n2/ Test getEmployeeWithMaxSalary()");
            System.out.print("\nEnter TC: ");
            
            k = sc.nextInt();

            switch (k) {
                case 1:
                    System.out.print("Enter ID you want to find: ");
                    int id = sc.nextInt();
                    System.out.format("%s", emplyees.getNameById(id).toUpperCase());
                    break;
                case 2:
                    System.out.print(emplyees.getEmployeeWithMaxSalary().toString());
                    break;
            }
        }
    }
}
