import java.util.*;
public class MethodReturnEx1
{
 static String myMethod()
 {
   System.out.println("Enter the Name");
   Scanner sc=new Scanner(System.in);
   String Name = sc.nextLine();
   return Name;
 }

public static void main(String a[])
{
  String name = myMethod();
  System.out.println("Your Name is: "+ name);
}
}