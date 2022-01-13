import java.util.*;
public class Main
{
 public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  System.out.println("This code takes input from user and store them in array and then returns the same.");
  System.out.print("Enter size of Array: ");
  int size= s.nextInt();
  String name[]= new String[size];
  System.out.println("Enter value consecutively by pressing enter on entering earch value. ");
  for (int i=0;i<size ; i++) {
      name[i]= s.nextLine();
  }
  for (int i=0;i<name.length ; i++){
      System.out.print(name[i]+" ");
  } 
 }
}
