package exinterface;

import java.util.Scanner;

public class StringProcessor implements IStringOperations {

    @Override
    public int coutVowels() {
        int count = 0;

        String s;

        System.out.print("Enter a String: ");
        Scanner input = new Scanner(System.in);
        s = input.nextLine();
        s = s.toLowerCase();
        
        System.out.println("OUTPUT");

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'u' || s.charAt(i) == 'e' || s.charAt(i) == 'o' || s.charAt(i) == 'a' || s.charAt(i) == 'i') {
                count++;
            }

        }
        return count;
    }

    void printCountVowels() {
        System.out.println(coutVowels());
    }

    @Override
    public String reverString() {
        System.out.print("Enter a String: ");

        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String reverS = "";
        
        System.out.println("OUTPUT");
        for (int i = s.length() - 1; i >= 0; i--) {
            reverS = reverS + s.charAt(i);
        }
        return reverS;
    }

    void printReverString() {
        System.out.println(reverString());
    }

}
