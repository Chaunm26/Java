/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrtest;

import java.util.Scanner;

/**
 *
 * @author ChauNguyen
 */
public class ArrTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        instruction();
        System.out.println("Enter your choice");
        int choice =sc.nextInt();
        boolean flag = true; 
        while(flag){
            switch (choice) {
                case 0:
                    buildTStructure();
                    break;
                case 1:
                    showEList();
                    break;
                case 2:
                    addE();
                    break;
                case 3:
                    updateE();
                    break;
                case 4:
                    searchE();
                    break;
                    
                case 5:
                    sortE();
                    break;
                case 6:
                    sortE();
                    break;   
            }
        }
        
    }
    public static void buildTStructure(){
        
    }
    
    public static void showEList(){
        
    }
    public static void addE(){
        
    }
    public static void updateE(){
        
    }
    public static void searchE(){
        
    }
    
    public static void storeData(){
        
    }
    
    public static void sortE(){
        
    }
    
    
   
    
    public static void instruction(){
        System.out.println("Press");
        System.out.println("0 - Build the structure");
        System.out.println("1 - Show the Employee list");
        System.out.println("2 - Add Employee");
        System.out.println("3 - Update Employee");
        System.out.println("4 - Search Employee");
        System.out.println("5 - Store data to file");
        System.out.println("6 - Sort Employee");
  
        
    }
    
}
