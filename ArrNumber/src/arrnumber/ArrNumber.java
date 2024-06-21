package arrnumber;

import data.InputArr;


public class ArrNumber {

    public static void main(String[] args) {
        InputArr numbers= new InputArr();
        numbers.input();
        System.out.println(numbers.sumOfArr());
        System.out.println(numbers.getN());
    }
}