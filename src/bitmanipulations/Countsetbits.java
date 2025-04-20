package bitmanipulations;

import java.util.Scanner;

public class Countsetbits {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = scanner.nextInt();
		int count=0;
		while(n != 0) {
			n = n & (n-1);
			count++;
		}
		System.out.print(count);

		scanner.close();
	}
}
