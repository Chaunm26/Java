/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luyentap;

//1. Viết hàm kiểm tra một số có phải số nguyên tố hay không?
//2. 100 số nguyên tố đầu tiên
//3. giải pt ax+b=0
import java.util.Scanner;

public class LuyenTap {

    public static void main(String[] args) {

        //primeNumber();
        printPrimeList();
        //solve();

    }

    public static int nhapN() {
        int n;
        System.out.print("n = ");
        Scanner soTuNhienN = new Scanner(System.in);
        n = soTuNhienN.nextInt();
        return n;
    }

    public static boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }

        return true;
    }

    public static void primeNumber() {

        if (checkPrime(nhapN()) == false) {
            System.out.println("Not Prime ");
        } else {
            System.out.println("Is Prime ");
        }

    }

    public static void printPrimeList() {
        int n = nhapN();
        int dem = 0;
        int i = 1;
        while (dem < n) {
            if (checkPrime(i) == true) {
                System.out.print(i + " ");
           
                dem++;
            }
            i++;
        }
        System.out.println("\n");

    }

    public static double nhapA() {

        System.out.print("a = ");
        Scanner soThuNhat = new Scanner(System.in);
        double a = soThuNhat.nextInt();
        return a;
    }

    public static double nhapB() {

        System.out.print("b = ");
        Scanner soThuHai = new Scanner(System.in);
        double b = soThuHai.nextInt();
        return b;
    }

    //ax+b=0;
    public static void solve() {
        double a = nhapA();
        double b = nhapB();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Pt vô số nghiệm");
            } else {
                System.out.println("pt vô nghiệm");
            }
        } else {
            System.out.println("Pt có 1 nghiệm -b/a = " + (-b / a));
        }

    }
}
