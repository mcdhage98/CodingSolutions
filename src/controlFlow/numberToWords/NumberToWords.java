package controlFlow.numberToWords;

public class NumberToWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numberToWords(0);

	}
	
	public static void numberToWords(int number) {
		if (number < 0)
		{
			System.out.println("Invalid Value");
			return;
		}
		if (number == 0)
		{
			System.out.println("Zero");
			return;
		}
		
		int temp = reverse(number);
		int numberLength=getDigitCount(number);
		int tempLength=getDigitCount(temp);
		while (temp > 0) {
			int rem = temp % 10;
			temp/=10;

			switch (rem) {
			case 0:
				System.out.println("Zero");
				break;
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7:
				System.out.println("Seven");
				break;
			case 8:
				System.out.println("Eight");
				break;
			case 9:
				System.out.println("Nine");
				break;

			}
			
		}
		for(int i=0;i<Math.abs(numberLength-tempLength);i++)
		{
			System.out.println("Zero");
		}

	}

	
	
	public static int reverse(int number) {
		boolean negative=false;
		if(number<0)
			negative=true;
			
		int temp=Math.abs(number);
		int sum=0;
		int count=0;
		while(temp>0) {
			int rem=temp%10;
			if(count<0)
				sum=sum+rem;
			else
				sum=sum*10+rem;
			temp/=10;
				
		}
		if(negative)
			return -1*sum;
		return sum;
	}
	
	public static int getDigitCount(int number) {
		if(number<0)
			return -1;
		if(number==0)
		    return 1;
		int temp=number;
		int count=0;
		while(temp>0) {
			temp/=10;
			count++;
		}
		return count;
	}
}
