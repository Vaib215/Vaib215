import java.util.*;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("This code tells about condtion of a student on the basis of his marks.Made by VAIB.  ");
        Scanner s = new Scanner(System.in);
        int b;
        do {
            System.out.print("Enter the marks : ");
            int a = s.nextInt();
            if (a<=100 && a>=90) {
                System.out.println("This is Good.");
            }
            else if(a<90 && a>=60){
                System.out.println("This is also Good.");
            }
            else if(a<60){
                System.out.println("This is Good as well.");
            }
            else {
                System.out.println("Invalid input");
            }
            System.out.println();
            System.out.print("DO YOU WANT TO CONTINUE? YES(1) or NO(0) : ");
            b = s.nextInt();
        } while (b==1);
        
        
    }
}
