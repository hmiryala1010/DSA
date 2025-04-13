package example;

public class Pattern2 {

	void printSpace(int n) {
		for(int i=0;i<n;i++)
			System.out.print(" ");
	}
	void printStar(int n) {
		for(int i=0;i<n;i++)
			System.out.print("* ");
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int mid=n/2;//3
		Pattern2 dp=new Pattern2();
		for(int i=0;i<=mid;i++) {
			dp.printSpace(mid-i);
			dp.printStar(i+1);
			System.out.println();
		}
		for(int i=mid;i>=1;i--) {
			dp.printSpace(mid-i+1);
			dp.printStar(i);
			System.out.println();
		}
		
 		   
	 
		
	  
	}

}
