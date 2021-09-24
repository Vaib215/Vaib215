import java.util.*;
public class Main
{

  public static void main (String[]args)
  {
    System.out.
      println
      ("This code prints palindromic pattern of rows of user's choice. Made by VAIB.");
    System.out.print ("Enter a Number : ");
    Scanner s = new Scanner (System.in);
    int n = s.nextInt ();
    for (int i = 1; i <= n; i++)
      {
	for (int j = n - i; j >= 1; j--)
	  {
	    System.out.print (" ");
	  }
	for (int j = i; j >= 1; j--)
	  {
	    System.out.print (j);
	  }
	for (int j = 2; j <= i; j++)
	  {
	    System.out.print (j);
	  }
	System.out.println ();
      }
  }
}
