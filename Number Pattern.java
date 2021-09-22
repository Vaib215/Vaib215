import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("This code prints a number pattern of rows of user choice."); 
        System.out.print("Enter a number : ");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        for (int b=1;b<=a;b++){
            for(int c=1;c<=b;c++){
                System.out.print(c);
            }

            System.out.println();
            
        }
        
    }
}
