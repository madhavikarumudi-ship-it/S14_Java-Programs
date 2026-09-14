// Searching for the element in the Array

import java.util.Scanner;

public class ArraySearch 
{
    public static void main(String args[]) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Reading array elements
        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        // Reading the element to search
        System.out.print("Enter the element to search: ");
        int search = sc.nextInt();

        // Searching the element
        boolean found = false;

        for (int i = 0; i < n; i++) 
        {
            if (arr[i] == search) 
            {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) 
        {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}