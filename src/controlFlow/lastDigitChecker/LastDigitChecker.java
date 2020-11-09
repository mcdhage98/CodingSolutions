package controlFlow.lastDigitChecker;

public class LastDigitChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hasSameLastDigit(20, 42, 78));

	}

	public static boolean hasSameLastDigit(int n1, int n2, int n3) {
		if (isValid(n1) && isValid(n2) && isValid(n1) && isValid(n2))
		{	int rem1 = n1 % 10;
			int rem2 = n2 % 10;
			int rem3 = n3 % 10;
			if (rem1 == rem2)
				return true;
			if (rem1 == rem3)
				return true;
			if (rem2 == rem3)
				return true;
		} 
			return false;
	}

	public static boolean isValid(int n) {
		if (n < 10 || n > 1000)
			return false;
		else
			return true;
	}

}
