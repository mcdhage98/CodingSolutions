package controlFlow.gcd;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getGreatestCommonDivisor(20, 50));

	}
	public static int getGreatestCommonDivisor(int n1,int n2) {
		if(n1<10||n2<10)
			return -1;
		  while(n1 != n2)
	        {
	            if(n1 > n2)
	                n1 -= n2;
	            else
	                n2 -= n1;
	        }
		  return n1;
	}

}
