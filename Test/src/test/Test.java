package test;

//import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Test {

    
    public static void main(String[] args) {
        Pattern p;
        Scanner sc =new Scanner(System.in);
        String s="";
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> a = new ArrayList<>();
//        a.forEach(i -> {
//            a.add(sc.nextInt(i));
//        });
//        //a.forEach(i -> System.out.println(i));
//        System.out.println("Số chẵn: ");
//        a.forEach(i -> {
//            if (i%2==0) {
//                System.out.print(i+" ");
//            }
//        });
//        System.out.println("\n");
        
//              Buoc nhap so: [0-9]+
//		Buoc nhap so co 3 chu so: [0-9]{3}
//		Buoc nhap so co 2 chu so tro len:[0-9]{2,} 
//		Buoc nhap so co 2 den 4 chu so:[0-9]{2,4}
//		(038).325.6720: \\([0-9]{3}\\)\\.[0-9]{3}\\.[0-9]{4}
//		MaSV: FPTSE1010: FPT[A-Z]{2}[0-9]{4}
//		Email: tungh4@fe.edu.com.vn: [a-zA-Z0-9]+@[a-z]{2,}(\\.[a-z]{2,}){1,3}
//		Date: reconsider

        while(true){
            System.out.print("Enter a number: ");
            s=sc.nextLine();
            //p=Pattern.compile("^[0-9]+$");
            //p=Pattern.compile("^[0-9]{3}");
            //p=Pattern.compile("^[0-9]{2,4}");
            p=Pattern.compile("^FPT[A-Z]{2}[0-9]{4}");
            if(p.matcher(s).find())  {
            System.out.println("OK");
            break;
        }
            else {
                System.out.println("Please try again!!");
            }
            

        }
        

    }
    
}
