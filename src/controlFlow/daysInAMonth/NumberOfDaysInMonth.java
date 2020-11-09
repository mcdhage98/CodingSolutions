package controlFlow.daysInAMonth;

public class NumberOfDaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDaysInMonth(2, 2020));
		

	}
	

		public static boolean isLeapYear(int year) {
			if(year<1 || year>9999) {
				return false;
			}
			if(year%4==0) {
				if(year %100==0) {
					if(year%400==0) {
						return true;
					}
					else
						return false;
				}else
					return true;
			}
			else 
				return false;
		}
	
	
	public static int getDaysInMonth(int month,int year) {
		if(year<1 || year>9999) {
			return -1;
		}
		int res;
		boolean leapYear=isLeapYear(year);
		switch(month) {
		case 1:case 3: 
				case 5:
					case 7:
						case 8:
							case 10:
								case 12:
									return 31;
									
		case 4:
		case 6:
		case 9:
		case 11:return 30;
		case 2:if(leapYear) return 29;
		else return 28;
		
		
	}
		return -1;
	}

}
