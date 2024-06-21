
package caculator;

import java.util.Scanner;


public abstract class CaculatorNumber {
    int a,b;
    void input(){
         Scanner sc = new Scanner(System.in);
         System.out.print("a = ");
         a=sc.nextInt();
         System.out.print("b = ");
         b=sc.nextInt();
        
    }
    abstract int Total();
    abstract int Subtract();
    abstract int Product();
    abstract float Divide();
}
