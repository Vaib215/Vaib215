import java.util.*;
 
public class Main {
    public static void Exp(int x,int n){
        int a = 1;
        for (int i=1;i<=n ;i++ ){
            a=a*x;
        }
        System.out.print(a);
    }
   public static void main(String args[]) {
       System.out.println("This code prints the exponent value of form x^n. Made by VAIB");
       System.out.print("Enter x: ");
       Scanner s= new Scanner(System.in);
        int x=s.nextInt();
       System.out.print("Enter n: ");
        int n=s.nextInt();
        Exp(x,n);
   }   
}
