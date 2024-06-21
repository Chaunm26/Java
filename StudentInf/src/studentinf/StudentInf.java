
package studentinf;

import java.util.Scanner;
import data.Information;




public class StudentInf {

    
    public static void main(String[] args) {
            input();
            System.out.println("Helloooooooo");
    }
    
   public static void input(){
        String name, address, email, studentCode,phoneNumber;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        name=sc.nextLine();
        System.out.print("Address: ");
        address=sc.nextLine();
        System.out.print("Email: ");
        email=sc.nextLine();
        System.out.print("Phone Number: ");
        phoneNumber=sc.nextLine();
        System.out.print("Student code: ");
        studentCode=sc.nextLine();
        Information x= new Information(name, address, email, phoneNumber, studentCode);
        x.showProfile();
        
        
    }
}
