package metod_overriding;

public class Multiplication extends Calculator {

	public String calculation(int inputone, int inputtwo) {
		int res = inputone * inputtwo;
		return " Multiplication : " + res;
	}
}
