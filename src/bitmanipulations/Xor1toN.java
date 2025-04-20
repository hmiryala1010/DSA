package bitmanipulations;

import java.util.Scanner;

public class Xor1toN {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = scanner.nextInt();
		if( n % 4 == 0)
			System.out.print(n);
		if( n % 4 == 1)
			System.out.print(1);
		if( n % 4 == 2)
			System.out.print(n+1);
		if( n % 4 == 3)
			System.out.print(0);

		scanner.close();
	}
}
//tc  O(1)
//sc O(1)