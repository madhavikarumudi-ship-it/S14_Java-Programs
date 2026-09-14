class MethodEx
{
  static void add()
  {
    int x=10;
    int y=20;
    int z=x+y;
    System.out.println("Result of Addition is: "+z);
   }
}
public class Hello
{
public static void main(String args[])
{
  MethodEx m = new MethodEx();
  m.add();
}
}