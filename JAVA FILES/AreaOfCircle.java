import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        System.out.println("This code calulates area of circle having radius of your choice(only integer). Made by VAIB. ");
        int r;
        double pi = 3.14, area;
        Scanner s = new Scanner( System.in );
        System.out.print( "Enter radius in meter:" );
        r = s.nextInt();
        area = pi * r * r;
        System.out.println( "area of circle is "+area+" sq. metre"); 
    }
}
