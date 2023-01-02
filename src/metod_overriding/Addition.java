package metod_overriding;

public class Addition extends Calculator {

	public String calculation(int inputone, int inputtwo) {
		int res = inputone + inputtwo;
		return " Addition : " + res;
	}
}
