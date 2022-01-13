
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        double d;
        System.out.println("This code calculates simple interest on amount entered by user. Made by VAIB. ");
        System.out.print("Enter Amount :");
        Scanner s = new Scanner( System.in);
        a = s.nextInt();
        System.out.print("Enter Rate per annum :");
        b = s.nextInt();
        System.out.print("Enter time in years :");
        c = s.nextInt();
        d = a * b * c / 100;
        
        System.out.println("SI on amount "+a+" at the rate of "+b+" per annum for "+c+" is :"+d);
    }
}
