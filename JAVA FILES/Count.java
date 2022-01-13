import java.util.*;
 
public class Main {
    public static void Count(int c){
        int x = 0, y = 0, z = 0;
       System.out.println("Press 1 to continue & 0 to stop");
       Scanner sc = new Scanner(System.in);
       int b = sc.nextInt();
 
       while(b == 1) {
           System.out.println("Enter your number : ");
           int a = sc.nextInt();
           if(a > 0) {
               x++;
           } else if(a < 0) {
               y++;
           } else {
               z++;
           }
 
           System.out.println("Press 1 to continue & 0 to stop");
           b = sc.nextInt();
       }
 
       System.out.println("Positives : "+ x);
       System.out.println("Negatives : "+ y);
       System.out.println("Zeros : "+ z);
    }
   public static void main(String args[]) {
       System.out.println("This code counts +ve,-ve & 0s entered by user. Made by VAIB");
       int c=0;
       Count(c);
       
   }   
}
