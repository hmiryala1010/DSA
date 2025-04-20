package bitmanipulations;

import java.util.Scanner;

public class ReverseBitsOf32Integer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = scanner.nextInt();
		int result = 0;
		for(int i=0;i<32;i++) {
			result <<= 1;
			result |= (n & 1);
			n >>= 1;
		}
		System.out.println(result);
		System.out.println(Integer.toBinaryString(result));//it removes leading zeros 
		System.out.println(String.format("%32s", Integer.toBinaryString(result)).replace(' ', '0'));


		scanner.close();
	}
}
//tc O(32) = O(1)
//sc O(1)
