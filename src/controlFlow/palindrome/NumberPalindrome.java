package controlFlow.palindrome;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(101));

	}
	
	public static boolean isPalindrome(int number) {
		number=Math.abs(number);
		int temp=number;
		int rev=0;
		int count=0;
		while(temp>0) {
			
			int rem=temp%10;
			if(count<1)
				rev=rev+rem;
			else
				rev=rev*10+rem;
			temp=temp/10;
			count++;
			
		}
		if(number==rev)
			return true;
		else
			return false;
	}

}
