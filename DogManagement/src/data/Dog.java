/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

//Khuôn dùng để đúc ra các Object(đối tượng)
//Khuôn phải kín- Code bên ngoài là khuôn bị lủng
//Chứa các đặc điểm Object tương lai sẽ có
public class Dog {

    private String name;
    private int yob;
    private double weight;
    //...

    // Có khuôn thì phải có phễu để hứng vật liệu đi vào
    //Phễu dùng để nhận vật liệu, contruct Object
    public Dog(String iName, int iYob, double iWeight) {
        name = iName;
        yob = iYob;
        weight = iWeight;

    }
//    public void Bark(){
//        System.out.println("Gogogogoogo....My name is "+ name);
//        System.out.println("Gogogogoogo....My name is "+ yob);
//        System.out.println("Gogogogoogo....My name is "+ weight);
//
//
//    }
    public void Bark(){
        System.out.printf("|%-10s|%d|%4.1f|\n",name, yob, weight);
    }
    
    public void setNewWeight(double newWeight) {
        weight = newWeight;
    }

    @Override
    public String toString() {
        //return "Dog{" + "name=" + name + ", yob=" + yob + ", weight=" + weight + '}';
        return String.format("|%-10s|%d|%4.1f|\n",name, yob, weight);
    }
    
    
    
    
}
