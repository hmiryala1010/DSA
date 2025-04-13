package slidingwindow;

import java.util.Scanner;

public class LargestOfWindow {

	int largestOfWindow(int[] a,int left,int right,int k) {//O(k)
		int max=Integer.MIN_VALUE;
		while(k>0) {
			max=Math.max(max,a[left]);
			if(left==right) {
				return max;
			}
			left++;
			k--;
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LargestOfWindow low=new LargestOfWindow();
		System.out.println("enter n");
		int n=sc.nextInt();
		System.out.println("enter k");
		int k=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int first=0;
		int last=k-1;
		while(last<n) {//O(n)
			System.out.println(low.largestOfWindow(a,first,last,k));
			first++;
			last++;
		}
		sc.close();
	}

}//tc O(nk)
