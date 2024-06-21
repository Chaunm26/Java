package luyentap03;

import java.util.Calendar;

public class LuyenTap03 {

    public static void main(String[] args) {
        
        Calendar c = Calendar.getInstance();
        System.out.format("%tB %te, %tY%n", c, c, c);
        System.out.format("%tH: %tM %tS %tp%n", c,c,c,c);
        System.out.format("%tD %n",c);
        
        
    }

}
