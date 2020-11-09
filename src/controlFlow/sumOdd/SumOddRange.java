package controlFlow.sumOdd;

public class SumOddRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOdd(100, 100));

	}
	public static boolean isOdd(int n) {
		if(n<1)
			return false;
		if(n%2==1)
			return true;
		else return false;
	}
	
	public static int sumOdd(int n1,int n2) {
		if(n1<1||n2<1)
			return -1;
		if(n2<n1)
			return -1;
		
		int sum=0;
		for(int i=n1;i<=n2;i++) {
			if(isOdd(i)) sum=sum+i;
			
		}
		return sum;
	}

}
