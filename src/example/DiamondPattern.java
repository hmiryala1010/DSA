package example;

public class DiamondPattern {

	void printSpace(int n) {
		for(int i=0;i<n;i++)
			System.out.print(" ");
	}
	void printStar(int n) {
		for(int i=0;i<n;i++)
			System.out.print("*");
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		int mid=n/2;
		DiamondPattern dp=new DiamondPattern();
		for(int i=0;i<=mid;i++) {
			dp.printSpace(mid-i);
			dp.printStar(2*i+1);
			System.out.println();
		}
		for(int i=mid;i>=1;i--) {
			dp.printSpace(mid-i+1);
			dp.printStar(i*2-1);
			System.out.println();
		}
		
 		   
	 
		
	  
	}

}
