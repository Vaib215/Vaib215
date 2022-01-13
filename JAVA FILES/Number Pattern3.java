import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("This code prints a special number pattern of rows of user choice. Made by VAIB."); 
        System.out.print("Enter a number : ");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int d=1;
        for (int b=1;b<=a;b++){
            for(int c=1;c<=b;c++){
                System.out.print(d+" ");
                d++;
            }

            System.out.println();
            
        }
        
    }
}
