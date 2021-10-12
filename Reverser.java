import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("This code reverses the line/word given by user. Made by VAIB.");
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a word: ");
		StringBuilder sb = new StringBuilder(sc.nextLine());
		for (int i=0;i< sb.length()/2;i++ ) {
		    int front = i;
		    int back = sb.length()-i-1;
		    char frontChar = sb.charAt(front);
		    char backChar = sb.charAt(back);
		    
		    sb.setCharAt(front, backChar);
		    sb.setCharAt(back, frontChar);
		}
		System.out.println(sb);
	}
}
