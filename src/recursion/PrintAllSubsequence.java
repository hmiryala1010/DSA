package recursion;

import java.util.ArrayList;

public class PrintAllSubsequence {

	public static void main(String[] args) {
		ArrayList<Integer> result=new ArrayList<>();
		int[] arr= {3,1,2};
		int n=3,i=0;
		printF(i,n,result,arr);
	}

	private static void printF(int i, int n, ArrayList<Integer> result, int[] arr) {
		if(i>=n) {
			System.out.println(result);
			return;
		}
		result.add(arr[i]);
		printF(i+1,n,result,arr);
		result.remove(result.size()-1);
		printF(i+1,n,result,arr);
	}

}
