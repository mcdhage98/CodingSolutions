package controlFlow.firstLastDigitSum;

public class FirstLastDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumFirstAndLastDigit(0));
		

	}
	public static int sumFirstAndLastDigit(int number) {
		if(number<0)
			return -1;
		String s=Integer.toString(number); 
		int n1=Integer.parseInt(s.charAt(0)+"");
		int n2=Integer.parseInt(s.charAt(s.length()-1)+"");
		return n1+n2;
	}

}
