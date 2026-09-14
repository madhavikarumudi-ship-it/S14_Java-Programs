//Factorial of a given number using methods

import java.util.*;

public class FactorialEx
{
    static int factorial(int n)  //n=2, n=5
    {
        if (n == 0 || n == 1)
            return 1;

        int fact = 1;

        for(int i = 1; i <= n; i++) // 1,2,3,4,5,6
        {
            fact = fact * i;   //1*1=1, 1*2=2, 2*3=6, 6*4=24, 24*5=120
        }

        return fact;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");  //5
        int n = sc.nextInt(); //n=5

        System.out.println("Factorial of " + n + " is: " + factorial(n));

    }
}


