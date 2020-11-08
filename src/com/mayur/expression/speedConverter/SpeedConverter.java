package com.mayur.expression.speedConverter;

public class SpeedConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printConversion(-2.2);

	}
	
	public static long toMilesPerHour(double kilometersPerHour) {
		if(kilometersPerHour<0)
			return -1;
		else {
			return Math.round(kilometersPerHour/1.609);
		}
	}
	
	public static void printConversion(double kilometersPerHour) {
		if(kilometersPerHour<0)
			{System.out.println("Invalid Value");
			return;
			}
			
		long milesPerHour=toMilesPerHour(kilometersPerHour);
		System.out.println(kilometersPerHour+" km/h = "+milesPerHour+" mi/h");
	}
	
	

}
