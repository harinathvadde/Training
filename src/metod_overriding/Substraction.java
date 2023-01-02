package metod_overriding;

public class Substraction extends Calculator {

	public String calculation(int inputone, int inputtwo) {
		int res = inputone - inputtwo;
		return " Substraction : " + res;
	}
}
