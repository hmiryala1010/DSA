package example;

import java.util.Scanner;

public class NumberToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		NumberToBinary nb=new NumberToBinary();
		System.out.print(nb.findNumberToBinary(input));
		sc.close();
		

	}

	 String findNumberToBinary(int input) {
		// TODO Auto-generated method stub
		 StringBuilder sb=new StringBuilder();
		 while(input>0) {
			 sb.append(input%2);
			 input=input/2;
		 }
		 return sb.reverse().toString(); 
	}
	 
//tc O(logN)
	 //sc O(logN)
	 
	 
	 
}
