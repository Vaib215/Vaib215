
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        int a;
        System.out.println("This code prints the table of number chosen by user. Made by VAIB");
        System.out.print("Enter a number :");
        Scanner s = new Scanner( System.in);
        a = s.nextInt();
        System.out.println("The table of "+a+" is :");
        System.out.print(a+"X 1 = ");
        System.out.println(a*1);
        System.out.print(a+"X 2 = ");
        System.out.println(a*2);
        System.out.print(a+"X 3 = ");
        System.out.println(a*3);
        System.out.print(a+"X 4 = ");
        System.out.println(a*4);
        System.out.print(a+"X 5 = ");
        System.out.println(a*5);
        System.out.print(a+"X 6 = ");
        System.out.println(a*6);
        System.out.print(a+"X 7 = ");
        System.out.println(a*7);
        System.out.print(a+"X 8 = ");
        System.out.println(a*8);
        System.out.print(a+"X 9 = ");
        System.out.println(a*9);
        System.out.print(a+"X 10 = ");
        System.out.println(a*10);
    }
}
