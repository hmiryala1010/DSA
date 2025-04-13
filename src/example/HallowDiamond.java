package example;

public class HallowDiamond {
	
	void printSpace(int n) { //n
		for(int i=0;i<n;i++)
			System.out.print(" ");
	}
	void printStar(int n) { //n
		for(int i=0;i<n;i++)
			System.out.print("*");
	}

	public static void main(String[] args) {
		
		int n=15;
		int mid=n/2;//3
		HallowDiamond hd=new HallowDiamond();
		for(int i=0;i<=mid;i++) {  //n/2
			hd.printSpace(mid-i);  //n/2
			hd.printStar(1); //n/2
			if(i>0) {
				hd.printSpace(2*(i-1)+1);
				hd.printStar(1);
			}  
			System.out.println();
		} //O(n^2)
		for(int i=1;i<=mid;i++) {
			hd.printSpace(i);
			hd.printStar(1);  
			if(i<mid)
			{ 
				hd.printSpace(2*(mid-i)-1);
				hd.printStar(1);
			} 
			System.out.println();
		}

	}
	// tc O(N^2)
	//sc O(1)
	 
}
