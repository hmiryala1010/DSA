package example;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		Factorial f=new Factorial();
		System.out.print(f.calculateFactorialUsingRecursion(input));
		sc.close();

	}

	int calculateFactorial(int input) {
		// TODO Auto-generated method stub
		int result=1;
		for(int i=1;i<=input;i++) {
			result*=i;
		}
			
		return result;
	}
	
	//tc O(N)
	//sc O(1)
	
	int calculateFactorialUsingRecursion(int input) {
		if(input==1 || input==0) return 1;
		 
				
		return input*calculateFactorialUsingRecursion(input-1);
	}
	//tc O(N)
	//sc O(N)

}
