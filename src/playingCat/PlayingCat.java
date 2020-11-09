package playingCat;

public class PlayingCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isCatPlaying(true,- 48));
		

	}
	public static boolean isCatPlaying(boolean summer,int temperature) {
		if(summer) {
			if(temperature>=25 && temperature<=45) {
				return true;
			}
			else return false;
		}
		else {
			if(temperature>=25 && temperature<=35 ) {
				return true;
			}
			else 
				return false;
		}
	}

}
