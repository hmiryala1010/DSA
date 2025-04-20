package bitmanipulations;

import java.util.Scanner;

public class Powerof2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = scanner.nextInt();
		if ( (n & (n - 1)) == 0)
			System.out.print("Power of 2");
		else
			System.out.print("Not a Power of 2");

		scanner.close();
	}
}
//tc  O(1)
//sc O(1)