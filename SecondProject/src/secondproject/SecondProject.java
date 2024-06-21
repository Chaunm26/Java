
package secondproject;

import data.SellBike;


public class SecondProject {

    public static void main(String[] args) {
        SellBike p= new SellBike(1,"martin 107", 500);
        //p.showProduct();
        System.out.println(p.getSalePrice());
        System.out.println(p.toString());
       
    }
    
}


