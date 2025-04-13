package example;

import java.util.Scanner;

public class Palindrome {

	boolean checkPalindrome(String input) {
		int n=input.length();
		int left=0;
		int right=n-1;
		while(left<right) {
			if(input.charAt(left)==input.charAt(right)) {
				left++;
				right--; 
			}
			else
			{
				return false;
			}
		 
		}
		return true;
		
		
	}
	//tc O(N/2)= O(N) becoz while checking only half
	//sc O(1)
	 
	
	boolean checkPalindromeUsingRecursion(String input,int left,int right) {
		if(left>right) return true;
		 
		
		if(input.charAt(left)==input.charAt(right)) {
			left++;
			right--; 
			return checkPalindromeUsingRecursion(input,left,right);
		}
		else {
			return false;
		}
		//tc O(N) actually n/2
		//sc O(N) stack with size  actually n/2
 
		
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		Palindrome p=new Palindrome();
	
		System.out.print(p.checkPalindromeUsingRecursion(input,0,input.length()-1));
		sc.close();
	}

}
