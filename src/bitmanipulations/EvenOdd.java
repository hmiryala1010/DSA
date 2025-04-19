package bitmanipulations;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number");
		int n = scanner.nextInt();
		if ((n & 1) == 1)
			System.out.print("odd number");
		else
			System.out.print("even number");

		scanner.close();
	}

}//tc O(1)
//sc O(1)
