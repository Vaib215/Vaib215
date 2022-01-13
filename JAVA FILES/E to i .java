import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("This code changes "e" into "i" in the line/word given by user. Made by VAIB.");
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a word: ");
		StringBuilder sb = new StringBuilder(sc.nextLine());
		
		for (int j=0;j< sb.length() ;j++ ) {
		    int i= sb.indexOf("e");
		    if (i>=0){
		    sb.setCharAt(i,'i');
		    }
		}
		System.out.println(sb);
		
	}
}
