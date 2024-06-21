package arrayex;

import shape.*;
public class ArrayEx {

    
    public static void main(String[] args) {
        //Square square= new Square();
        //System.out.println(square.calcS());
        
        Shape shape=new Shape();
        Square square=(Square) shape;
        System.out.println(shape.calcS());
        System.out.println(square.calcS());
              
    }
    
}
