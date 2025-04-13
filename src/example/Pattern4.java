package example;

public class Pattern4 {
	
	void printSpace(int n) {
		for(int i=0;i<n;i++)
			System.out.print(" ");
	}
	void printNumber(int start,int end) {
		for(int i=start;i<=end;i++)
			System.out.print(i+" ");
	}
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		//int mid=n/2;//2
		Pattern4 dp=new Pattern4();
		for(int i=1;i<=n;i++) {
			dp.printSpace(i-1);
			dp.printNumber(i,n);
			System.out.println();
		}

	}

}
