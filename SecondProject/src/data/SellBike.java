
package data;


public class SellBike {
    private int id;
    private String name;
    private double price;

    public SellBike(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getSalePrice() {
        return price;
    }

    

   
    
    //Override: Một p.thức ở lớp con, cùng tên với p.th cha. (tựghi đè lên)

//    @Override
//    public String toString() {
//        return String.format("|%8d|%-25s|%4.1f|",id,name,price);
//    }
//    public void showProduct(){
//        System.out.printf("|%3d|%-15s|%.1f|",id,name,price);
//    }

    

    
    
    
}
