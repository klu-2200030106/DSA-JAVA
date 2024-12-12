import java.util.*;
public class One
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        
        // Input array elements
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        
        // Sort the array
        Arrays.sort(a);
        
        // Find max, min, and sum more efficiently
        int max = a[n-1];
        int min = a[0];
        int sum = 0;
        
        // Calculate sum
        for(int i = 0; i < n; i++)
        {
            sum += a[i];
        }
        
        // Output results
        System.out.println("Maximum element is: " + max);
        System.out.println("Minimum element is: " + min);
        System.out.println("Sum of all elements is: " + sum);
        
        sc.close();
    }
}