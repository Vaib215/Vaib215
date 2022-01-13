import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("This code prints number triangle of rows of user choice."); 
        System.out.print("Enter a number : ");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int d=1;
        for (int b=a;b>=1;b--){
            for(int c=1;c<=b-1;c++){
                System.out.print(" ");
            }
            for(int c=1;c<=d;c++){
                System.out.print(d+" ");
            }
            d++;
            System.out.println();
            
        }
        
    }
}
