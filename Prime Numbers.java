import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            System.out.println("This code prints all the prime numbers till the number given by user. Made by VAIB. ");
            System.out.print("Enter a number: ");
            Scanner s= new Scanner(System.in);
            int a = s.nextInt();
        System.out.println("List of the prime number between 1 - " + a+"  ");
        System.out.println();
        for (int b = 2; b <= a; b++)
        {
            int c = 1;
            for (int i=2; i <= b/2; i++)
            {
                if ( b % i == 0)
                {
                    c = 0;
                    break;
                }
            }
			
            if ( c == 1 )
                System.out.println(b);
        }
    }
}
