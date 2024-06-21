
package vehicle;

import data.VehicleInformation;
import java.util.Scanner;


public class Vehicle {

    
    public static void main(String[] args) {
        dataVehicle();
    }
    //Nhaptubanphim
    public static void dataVehicle(){
        String chuXe, moTa;
        double triGia;
        int maXe, dungTich;
        Scanner sc = new Scanner(System.in);
        System.out.print("Chu xe: ");
        chuXe = sc.nextLine();
        System.out.print("Mo ta: ");
        moTa=sc.nextLine();
        System.out.println("Tri gia: ");
        triGia=sc.nextDouble();
        System.out.print("Ma xe: ");
        maXe=sc.nextInt();
        System.out.print("Dung tich: ");
        dungTich=sc.nextInt();
        
        VehicleInformation x = new VehicleInformation(chuXe, moTa, maXe, dungTich, triGia);
        x.showInformation();
        System.out.println(x.toString());
        
        
    }
    
}
