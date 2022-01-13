import java.util.*;
public class Main
{   
    public static void OddSum(int n){
        int sum = 0;
        for (int i=1; i<=n; i++){
            if (i%2!=0){ 
            sum=sum+i;
            }
        } 
        System.out.print(sum);
    }
	public static void main(String[] args) {
		System.out.println("This code prints sum of all odd numbers till the number given by user. Made by VAIB.");            
		System.out.print("Enter a number: ");
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		System.out.print("Sum of odd numbers from 1 to "+n+" is : ");
		OddSum(n);
	}
}
