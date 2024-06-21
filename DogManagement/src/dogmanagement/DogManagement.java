/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dogmanagement;

import data.Dog;


public class DogManagement {

    
    public static void main(String[] args) {
        //Lấy khuôn ra sử dụng
        Dog chiHu = new Dog("CHI HU HU ", 2020, 0.5);
        chiHu.Bark();
        
        //CaSi SonTung = ;
        Dog laXa = new Dog("Lăng Xăng", 2019, 6.5);
        laXa.Bark();
        //New: xin vùng ram mới/ Dữ liệu không bị đè lên nhau
        
        //HÀNH ĐỘNG phải gắn với OBJECT. Thông qua dấu chấm (.)
        
        //ENCAPSULATION: tính đóng gói của thông tin và hành động
        //Hàm biến đi kèm với nhau đại diện, mô tả cho một thực thể sống
        
        System.out.println("After overWeight");
        chiHu.setNewWeight(5);
        chiHu.Bark();
        System.out.print("CH details: "+ chiHu.toString());
        System.out.print("LX details: "+ laXa.toString());
        
    }
    
    
}
