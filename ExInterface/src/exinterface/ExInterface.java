package exinterface;

import java.util.Scanner;

public class ExInterface {

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        StringProcessor p = new StringProcessor();
        System.out.print("1. Count Vowels");
        System.out.print("\n2. Reverse String");
        System.out.print("\nEnter Test Case No.(1/2): ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                p.printCountVowels();
                break;
            case 2:
                
                p.printReverString();

                break;

        }

    }

}
