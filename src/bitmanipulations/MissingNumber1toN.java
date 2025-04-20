package bitmanipulations;

import java.util.Scanner;

public class MissingNumber1toN {//zero to N
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.print("Enter array elements: ");
        int xor = 0;
        
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            xor ^= a[i];
        }
        
        for (int i = 0; i <= n; i++) {  
            xor ^= i;
        }
        
        System.out.println("Missing number is: " + xor);
        
        scanner.close();
    }
}
//tc  O(n)
//sc O(n)