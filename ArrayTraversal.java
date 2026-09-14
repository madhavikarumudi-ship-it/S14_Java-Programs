import java.util.*;
public class ArrayTraversal 
{
    public static void main(String[] args) 
    {
 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Reading array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }


        System.out.println("Array elements are:");

        // Traversing the array
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.println(i +" element is " +arr[i]);  
        }
 System.out.println("End of the Array");  
    }
}  

/*

1 element is 10
2 element is 20 */
