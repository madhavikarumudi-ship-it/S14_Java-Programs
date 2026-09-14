
class MethhodOverloading
{
   void display()
   {
      System.out.println("Hello");
   }  
  void display()
   {
      System.out.println("Hi");
   }  
   void display()
   {
      System.out.println("Welocime to Method Overloading");
   }  
  void display()
   {
      System.out.println("Welcome");
   }  
    public static void main(String args[])
    {
      display(); //calling a method
      System.out.println("Inside the Main Method");
    }
}