
package luyentap02;

import java.util.Scanner;


public class LuyenTap02 {

    
    public static void main(String[] args) {
        int k = tinhTong(nhapTuBanPhim());
        System.out.println("Sum = " +k);

    }
    public static int nhapTuBanPhim(){
        int n;
        System.out.println("n = ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        return n;
    }
    public static int tinhTong(int n){
        int sum=0;
        
        for (int i = 0; i < n; i++) {
            sum=sum+i;
            
        }
        return sum;
    }
    public static void productNumber(int n) {
        
    }
    
}
