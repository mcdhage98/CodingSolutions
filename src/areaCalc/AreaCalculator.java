package areaCalc;

public class AreaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(area(5.0));
		
	}
	
	public static double area(double radius) {
		if(radius<0)
			return -1;
		else 
			return Math.PI*radius*radius;
	}
	
	public static double area(double l,double b) {
		if(l<0 ||b< 0)
			return -1;
		else return l*b;
	}

}
