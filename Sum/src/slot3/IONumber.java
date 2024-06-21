/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slot3;

//import java.util.Scanner;

/**
 *
 * @author ChauNguyen
 */
public class IONumber {
    int a,b;
    void Input(){
//        Scanner sc= new Scanner(System.in);
//        System.out.print("a = ");
//        a=sc.nextInt();
//        
//        System.out.print("b = ");
//        b=sc.nextInt();
        a=5;
        b=8;
                
        
    }
    
    int Total(){
        return a+b;
    }
    
    void Output(){
        System.out.println("Sum = "+ Total());
    }
}
