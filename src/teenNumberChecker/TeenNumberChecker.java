package teenNumberChecker;

public class TeenNumberChecker {
	public static void main(String[] args) {
		System.out.println(hasTeen(23, 0, 29));
		
	}
	
	public static boolean hasTeen(int n1,int n2,int n3) {
		if(n1>=13 && n1<=19 )
			return true;
		if(n2>=13 && n2<=19 )
			return true;
		if(n3>=13 && n3<=19 )
			return true;
		return false;
	}
	
	public static boolean isTeen(int n) {
		if( n>=13 && n<=19)
			return true;
		else
			return false;
	}

}
