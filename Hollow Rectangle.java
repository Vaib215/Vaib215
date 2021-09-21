import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("This code prints a hollow rectangle of size given by user. Made by VAIB."); 
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int a = s.nextInt();
        System.out.print("Enter number of columns: ");
        int b = s.nextInt();
        for(int c=1;c<=a;c++){
            for(int d=1;d<=b;d++){
                if(c==1 || c==a || d==1|| d==b){
                    System.out.print("#");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
