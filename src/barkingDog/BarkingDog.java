package barkingDog;

public class BarkingDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(shouldWakeUp(true, -1));

	}

	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
		if (hourOfDay < 0 || hourOfDay > 23)
			return false;
		if (barking) {

			if (hourOfDay < 8 || hourOfDay > 22)
				return true;
			else
				return false;
		} else
			return false;
	}

}
