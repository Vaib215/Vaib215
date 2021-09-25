import java.util.*;
public class Main
{   
    public static void Large(int a, int b){
        if(a>b){
            System.out.print(a);
        }
        else if(a<b){
            System.out.print(b);
        }
        else{
            System.out.print("None");
        }
    }
	public static void main(String[] args) {
		System.out.println("Hello World.");
		Scanner s=new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int a=s.nextInt();
		System.out.print("Enter Second Number : ");
		int b=s.nextInt();
		System.out.print("Larger Number is: ");
		Large(a,b);
	}
}
