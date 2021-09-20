import java.util.Scanner;
public class Main{
     public static void main(String []args){
        System.out.println("This code does mathematical operations on two numbers given by the user. Made by VAIB.");
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        b = sc.nextInt();
        System.out.println("Enter Mathematical operator name. Type 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division and 5 for Remainder.");
        c = sc.nextInt();
        switch(c) {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4: if b==0 {
                 system.out.println("Can't divide by zero");
                 else{
                System.out.println(a/b);
                      )
                break;
            case 5: if b==0 {
                 system.out.println("Can't divide by zero");
                 else{
                System.out.println(a%b);
                 }
                break;
            default:
                System.out.println("Invalid operation");
        }
            System.out.println("Thanks for using the Code.");
     }
}
