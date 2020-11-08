package com.mayur.expressions.megabytesCoverter;

public class MegaByteConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMegaBytesAndKiloBytes(-9);
		

	}
public static void printMegaBytesAndKiloBytes(int kiloBytes) {
	if(kiloBytes<0) {
		System.out.println("Invalid Value");
		return;
	}
	int remainingKiloBytes=kiloBytes%1024;
	int megaBytes=kiloBytes/1024;
	
	System.out.println(kiloBytes+" KB = "+megaBytes+" MB and "+remainingKiloBytes+" KB");
	
}
}
