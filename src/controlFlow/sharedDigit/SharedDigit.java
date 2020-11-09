package controlFlow.sharedDigit;

public class SharedDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hasSharedDigit(90, 21));

	}
	public static boolean hasSharedDigit(int n1,int n2) {
		if(n1<10||n2<10||n1>99||n2>99)
			return false;
		int temp1=n1;
		int temp2=n2;
		while(temp1>0) {
			int rem1=temp1%10;
			temp2=n2;
			while(temp2>0) {
				int rem2=temp2%10;
				if(rem1==rem2)
					return true;
				temp2/=10;
			}
			temp1/=10;
			
		}
		return false;
	}

}
