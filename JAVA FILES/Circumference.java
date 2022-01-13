import java.util.*;
public class Main
{   
    public static void Circum(int r){
        double c= 2*3.14*r;
        System.out.print(c);
    }
	public static void main(String[] args) {
		System.out.println("Hello World.");
		Scanner s=new Scanner(System.in);
		System.out.print("Enter radius : ");
		int r=s.nextInt();
		System.out.print("Circumference is: ");
		Circum(r);
	}
}
