package mang;

import java.util.Scanner;

public class Mang {

    public static void main(String[] args) {
        int n;
        int num, index;
        
        //Input       
        System.out.print("Enter the element of array: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = sc.nextInt();

        }
//Output
        for (int i = 0; i < n; i++) {

            System.out.print(a[i] + " ");

        }
        System.out.println("\n");

//Insert   
        int b[] = new int[n + 1];
        System.out.print("Number U want to Insert? ");
        num = sc.nextInt();
        System.out.print("\nIndex? ");
        index = sc.nextInt();
        
        for (int j = 0; j < n + 1; j++) {
             
             
             if (j>index) {
                 b[j] = a[j-1];
            } else{
                b[j]=a[j]; 
             }
             if (j==index) {
                 b[j]=num;
                 
             }
             
            
             
             System.out.print(b[j]+" ");
        }
        
        
        
    }

    

}
