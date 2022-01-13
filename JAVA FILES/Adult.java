import java.util.*;
public class Main
{   
    public static void Adult(int age){
        if(age<18){
            System.out.print("Not Eligible to Vote.");
        }
        else{
            System.out.print("Eligible to Vote.");
        }
    }
	public static void main(String[] args) {
		System.out.println("Hello World.");
		Scanner s=new Scanner(System.in);
		System.out.print("Enter your Age : ");
		int Age=s.nextInt();
		Adult(Age);
	}
}
