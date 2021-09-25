import java.util.*;
public class Main
{   
    public static void Inf(int a){
        do{
            System.out.print("  Error  ");
            
        } while(a>0);
        a++;
    }
	public static void main(String[] args) {
		System.out.println("Hello World.");
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int a=s.nextInt();
		Inf(a);
	}
}
