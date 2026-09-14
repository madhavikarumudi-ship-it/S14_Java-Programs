import java.util.*;
class Student
{
 static String myMethod()
 {
   System.out.println("Enter the Name");
   Scanner sc=new Scanner(System.in);
   String Name = sc.nextLine();
   return Name;
 }
}
public class MethodReturnEx2
{
public static void main(String a[])
{
Student s=new Student();
  
String name = s.myMethod();
  System.out.println("Your Name is: "+ name);
}
}