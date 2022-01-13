import java.util.*;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("This code prints the table of the number given by user. Made by VAIB."); 
        Scanner s = new Scanner(System.in);
        int a;
        System.out.print("Enter the number : ");
        a = s.nextInt();
        for(int i = 1; i<=10 ; i++) {
            System.out.print(a+" X "+i+" = ");
            System.out.println(a*i + " ");
        }
    }
}
