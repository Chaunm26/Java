
package hinhchunhat;

import data.Input;
import java.util.Scanner;



public class HinhChuNhat {

   
    public static void main(String[] args) {
        setDaiRong();
        
        var string = "repeat ";
        System.out.print(string.repeat(3));
    }
    
    //nhaptubanphhim
    public static void setDaiRong() {
        double chieuDai,chieuRong;
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Input chieu dai = ");
        chieuDai=sc.nextDouble();
        System.out.print("Input chieu rong = ");
        chieuRong=sc.nextDouble();
        
        Input x = new Input(chieuDai, chieuRong);
        System.out.println("Dien tich HCN = "+ x.tinhDienTich());
        System.out.println("Chu vi HCN = "+ x.tinhChuVi());
        
    }
    
}
