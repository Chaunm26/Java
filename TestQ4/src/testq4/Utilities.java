/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testq4;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author ChauNguyen
 */
public class Utilities implements Q4Interface{
    String s;
        
    @Override
    public int checkIntNumber() {
        Scanner sc = new Scanner(System.in);
        s=sc.nextLine();
        int n = Integer.parseInt(s);
        return n;
    }
    
    void printCheck(){
        Pattern p;
        p=Pattern.compile("^[0-9]");
        if (p.matcher(s).find()) {
            System.out.println(checkIntNumber()*checkIntNumber());
            
        } else{
            System.out.println(s.length());
        }
        
    }
    
}
