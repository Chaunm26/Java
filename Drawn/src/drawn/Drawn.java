package drawn;

import java.util.Scanner;

public class Drawn {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        n = sc.nextInt();
        retangle(n);
    }

    public static void retangle(int n) {
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || j == n - i-1) {

                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                }

            }
            System.out.print("\n");

        }
    }
}
