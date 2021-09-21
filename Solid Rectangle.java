import java.util.*;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("This code prints a solid rectangle of size given by user. Made by VAIB."); 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int a = s.nextInt();
        System.out.println("Enter number of columns: ");
        int b = s.nextInt();
        for(int c=1;c<=a;c++){
            for(int d=1;d<=b;d++){
                System.out.print("#  ");
            }
            System.out.println();
        }
    }
}
