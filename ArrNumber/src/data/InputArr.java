package data;

import java.util.ArrayList;
import java.util.Scanner;

public class InputArr {

    /**
     * 
     */
    private int n;
    private int sum = 0;
    ArrayList<Integer> list = new ArrayList<>();

    

    public int getN() {
        return n;
    }


    public int getSum() {
        return this.sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public void setList(ArrayList<Integer> list) {
        this.list = list;
    }
    
    
    
    
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Element of array: ");

        this.n = sc.nextInt();

        for (int i = 0; i < this.n; i++) {
            this.list.add(i, sc.nextInt());
        }

    }

    public void output() {
        for (int i = 0; i < this.n; i++) {
            System.out.print(this.list.get(i) + " ");

        }

    }

    public int sumOfArr() {
        for (int i = 0; i < this.n; i++) {
            this.sum += this.list.get(i);
            
        }
        return this.sum;
    }
}
