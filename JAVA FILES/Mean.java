import java.util.*;
public class Main
{   public static void Mean(int a, int b, int c ){
    int Avg=(a+b+c)/3;
    System.out.print(Avg);
}
	public static void main(String[] args) {
	    System.out.println("This code prints ");
		Scanner s= new Scanner(System.in);
		System.out.print("Enter 1st Number : ");
		int a= s.nextInt();
		System.out.print("Enter 2nd Number : ");
		int b= s.nextInt();
		System.out.print("Enter 3rd Number : ");
		int c= s.nextInt();
		System.out.print("The average of these 3 numbers is : ");
		Mean(a,b,c);
		
	}
}
