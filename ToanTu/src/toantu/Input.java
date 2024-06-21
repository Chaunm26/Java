
package toantu;

import java.util.Scanner;

public class Input {
    int a,b;
    
    void input(){
        
        Scanner sc=new Scanner(System.in);
        System.out.print("a = ");
        a=sc.nextInt();
        System.out.print("b = ");
        b=sc.nextInt();
          
    }
    
    void opera(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter opera(+ - * /): ");
        char op=sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println("a + b = "+(a+b));
                break;
            case '-':
                System.out.println("a - b = "+(a-b));   
                break;
            case '*':
                System.out.println("a * b = "+(a*b));   
                break;
            case '/':
                if (b==0) {
                    System.out.println("Not devide");   
                    break;
                } else{
                    System.out.println("a / b = "+(a/b));   
                    break;
                }
                
            default:
                break;
        }
    }
}
