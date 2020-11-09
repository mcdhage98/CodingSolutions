package decimalComparator;

public class DecimalComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));

	}

	public static boolean areEqualByThreeDecimalPlaces(double d1,double d2) {
		int num1=(int)(d1*1000);
		int num2=(int)(d2*1000);
		System.out.println(num1+" "+num2);
		if(num1==num2)
			return true;
		else
			return false;
		
	}
}
