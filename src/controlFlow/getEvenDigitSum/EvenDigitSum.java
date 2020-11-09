package controlFlow.getEvenDigitSum;

public class EvenDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getEvenDigitSum(123456789));

	}
	public static int getEvenDigitSum(int number) {
		if(number<0)
			return -1;
		int temp=number;
		int sum=0;
		
		while(temp>0) {
			int rem=temp%10;
			if(rem%2==0)
				sum+=rem;
			temp/=10;
		}
		return sum;
	}

}
