public class Main
{

  public static void main (String[]args)
  {
    System.out.println ("This code prints butterfly pattern. Made by VAIB.");
    int n = 4;
    for (int i = 1; i <= n; i++)
      {
	for (int j = 1; j <= i; j++)
	  {
	    System.out.print ("*");
	  }
	for (int j = 2*(n-i); j >= 1; j--)
	  {
	    System.out.print (" ");
	  }
	for (int j = i; j >= 1; j--)
	  {
	    System.out.print ("*");
	  }
	System.out.println ();
      }
    
    for (int i = n; i >= 1; i--)
      {
	for (int j = 1; j <= i; j++)
	  {
	    System.out.print ("*");
	  }
	for (int j = 2*(n-i); j >= 1; j--)
	  {
	    System.out.print (" ");
	  }
	for (int j = i; j >= 1; j--)
	  {
	    System.out.print ("*");
	  }
	System.out.println ();
      }
  }
}
