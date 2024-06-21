
package studentmanagement;

import java.util.Scanner;
import data.Student;

public class Main {

    
    public static void main(String[] args) {
        inputInf();
    }
    
    public static void inputInf() {
        String name, id;
        double gpa;
        int yob;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Id: ");
        id=sc.nextLine();
        System.out.println("Name: ");
        name=sc.nextLine();
        System.out.println("Year of birth: ");
        yob=sc.nextInt();
        System.out.println("GPA: ");
        gpa=sc.nextDouble();
        var x = new Student();
        x.showProfile();
    }
}
