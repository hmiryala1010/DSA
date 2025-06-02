package recursion;

import java.util.ArrayList;

public class PrintAllSubsequencesWithSumK {

	public static void main(String[] args) {
		ArrayList<Integer> result=new ArrayList<>();
		int[] arr= {1,2,1};
		int n=3,i=0,sum=0,k=2;
		printF(i,n,result,arr,sum,k);
		
}

	private static void printF(int i, int n, ArrayList<Integer> result, int[] arr, int sum, int k) {
		if(i==n)
		{
			if(sum==k)
			System.out.println(result);
			return;
		}
		
		result.add(arr[i]);
		sum+=arr[i];
		printF(i+1,n,result,arr,sum,k);
		sum-=arr[i];
		result.remove(result.size()-1);
		printF(i+1,n,result,arr,sum,k);
		
	}

}
