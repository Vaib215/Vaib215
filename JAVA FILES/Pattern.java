import java.util.*;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("This code prints inverted upper trianglar matrix of rows of user choice."); 
        System.out.print("Enter a number : ");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        for (int b=a;b>=1;b--){
            for(int c=1;c<=b;c++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        
    }
}
