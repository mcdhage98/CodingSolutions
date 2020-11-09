package controlFlow.allFactors;

public class FactorPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFactors(6);

	}
	
	public static void printFactors(int number) {
		if(number<1)
			System.out.println("Invalid Value");
		
		for(int i=1;i<=number;i++) {
			if(number%i==0)
				System.out.print(i+" ");
		}
	}

}
