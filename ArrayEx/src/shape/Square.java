/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape;

/**
 *
 * @author ChauNguyen
 */
public class Square extends Shape {
    private double edgeLength=0;
    
    public void input(){
        this.getS();
    }
    
    @Override
    public double calcS(){
        return -2;
    }
    
}
