import java.util.Scanner;

public class ArrayCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Reading array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Counting elements
        int count = 0;

        for (int i = 0; i < n; i++) 
        {
            count++;
        }

        System.out.println("Number of elements = " + count);

        sc.close();
    }
}