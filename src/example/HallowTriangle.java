package example;

public class HallowTriangle {

	void printStar(int n) {
		for(int i=0;i<n;i++)
			System.out.print("*");
	}
	void printSpace(int n) {
		for(int i=0;i<n;i++)
			System.out.print(" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		HallowTriangle ht=new HallowTriangle();
		for(int i=1;i<=n;i++) {
			ht.printSpace(n-i);
			if(i==1)
				ht.printStar(1);
			if(i>1 && i!=n) {
				ht.printStar(1);
				ht.printSpace(2*(i-1)-1);
				ht.printStar(1);
			}
			if(i==n) {
				if(n!=1)
				ht.printStar(2*(n-1)+1);
				
			}
			System.out.println();
			
		}
	}

}
