import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("This code prints a special 0 & 1 pattern of rows of user choice. Made by VAIB."); 
        System.out.print("Enter a number : ");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        for (int b=1;b<=a;b++){
            for(int c=1;c<=b;c++){
                if ((b+c)%2==0){
                System.out.print("1");    
                } 
                else{
                System.out.print("0");    
                }
            }

            System.out.println();
            
        }
        
    }
}
