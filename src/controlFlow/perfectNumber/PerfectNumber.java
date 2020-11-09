package controlFlow.perfectNumber;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPerfectNumber(-2));

	}
	
	public static boolean isPerfectNumber(int number) {
		int sum=0;
		if(number<=0)
			return false;
		for(int i=1;i<number;i++) {
			if(number%i==0)
				sum+=i;
		}
		if(sum==number)
			return true;
		return false;
	}

}
