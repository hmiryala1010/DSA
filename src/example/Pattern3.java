package example;

public class Pattern3 {

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
		int n=11;
		int mid=n/2;//2
		Pattern3 dp=new Pattern3();
		for(int i=0;i<=mid;i++) {
			dp.printSpace(i);
			dp.printStar(n-2*(i));
			System.out.println();
		}
		//int k=n;
		for(int i=1;i<=mid;i++) {
			  
			dp.printSpace(mid-i);
			dp.printStar(i*2+1);
			System.out.println();
		}
		
 		   
	 
		
	  
	}

}
