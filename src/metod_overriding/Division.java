package metod_overriding;

public class Division extends Calculator {
	
	public String calculation(int inputone, int inputtwo) {
		int res = inputone / inputtwo;
		return " Division : " + res;
	}
}
