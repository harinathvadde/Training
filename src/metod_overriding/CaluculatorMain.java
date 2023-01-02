package metod_overriding;

public class CaluculatorMain {

	public static void main(String[] args) {
		
		int inputone = 30;
		int inputtwo = 20;
	
		Calculator cal = new Calculator();
		Addition add = new Addition();
		Substraction sub = new Substraction();
		Multiplication mul = new Multiplication();
		Division div = new Division();
		Modulus rem = new Modulus();
		
		UpdatedCalculator uc = new UpdatedCalculator();
		System.out.println(uc.choiceCalculator(add, inputone, inputtwo));
		System.out.println(uc.choiceCalculator(sub, inputone, inputtwo));
		System.out.println(uc.choiceCalculator(mul, inputone, inputtwo));
		System.out.println(uc.choiceCalculator(div, inputone, inputtwo));
		System.out.println(uc.choiceCalculator(rem, inputone, inputtwo));
		
	}
}
