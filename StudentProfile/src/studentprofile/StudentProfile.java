package studentprofile;

import java.util.Scanner;

public class StudentProfile {

    public static void main(String[] args) {
        inputProfile();
    }

    public static void inputProfile() {
        // Khong OOP ( không chơi class Student), chỉ cần hiểu về việc nhập info trước đã.
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);

        //String tmpNumber=sc.nextLine(); //= với lệnh nextInt()
        //yob = Integer.parseInt(tmpNumber);
       

        while (true) {
            try {
                System.out.print("Year of birth: ");
                yob = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
               // System.out.println("Wrong!! Can you write again!!");
                System.out.println("Loi: "+e);
                
            }
        }

        System.out.print("Name: ");
        name = sc.nextLine().toUpperCase();
        
        System.out.print("Address: ");
        address = sc.nextLine().toUpperCase();
        
        System.out.println("Here is your profile: ");
        
        System.out.println("Year of birth: " + yob);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);

    }
}
