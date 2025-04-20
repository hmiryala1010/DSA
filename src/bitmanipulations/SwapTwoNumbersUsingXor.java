package bitmanipulations;

import java.util.Scanner;

public class SwapTwoNumbersUsingXor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter 1st number:");
		int a = scanner.nextInt();
		System.out.print("Enter 2nd number:");
		int b = scanner.nextInt();
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.print("After swapping " + " a = " + a + " b = " + b);
		 
		scanner.close();
	}
}
//tc  O(1)
//sc O(1)