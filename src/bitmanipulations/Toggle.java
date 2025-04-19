package bitmanipulations;

import java.util.Scanner;

public class Toggle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = scanner.nextInt();
		System.out.print("Enter i th bit to toggle:");
		int i = scanner.nextInt();
		n = ((1 << i) ^ n);
		System.out.print(n);

		scanner.close();
	}
}//tc O(1)
//sc O(1)
