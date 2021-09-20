import java.util.*;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("This code prints all the even numbers till the number given by user. Made by VAIB."); 
        int a;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        a = s.nextInt();
        for(int i=0; i<=a; i++) {
            if(i%2==0){
                System.out.println(i);
            }
            else{
                
            }
        }
        
    }
}
