import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("This code prints a diamond of side given by user. Code by VAIB.");
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    int n=s.nextInt();
	    for(int i=1;i<=n;i++){
	        for(int j=n-i;j>=1;j--){
	            System.out.print(" ");
	        }
	        for(int j=1;j<=2*i-1;j++){
	            System.out.print("~");
	        }
	        System.out.println();
	    }
	    for(int i=n;i>=1;i--){
	        for(int j=n-i;j>=1;j--){
	            System.out.print(" ");
	        }
	        for(int j=1;j<=2*i-1;j++){
	            System.out.print("~");
	        }
	        System.out.println();
	    }
	    
	}
}
    
