package metod_overriding;

public class Modulus extends Calculator {

	public String calculation(int inputone, int inputtwo) {
		int res = inputone % inputtwo;
		return " Reminder ; " + res;
	}
}
