package bitmanipulations;

import java.util.Scanner;

public class Getbit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = scanner.nextInt();
		System.out.print("Enter i th bit to get:");
		int i = scanner.nextInt();
		if (((n >> i) & 1) == 1)
			System.out.print("Bit 1");
		else
			System.out.print("Bit 0");

		scanner.close();
	}
}
//tc O(1)
//sc O(1)