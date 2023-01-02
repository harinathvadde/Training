package metod_overriding;

public class UpdatedCalculator {

	public String choiceCalculator(Calculator choice, int inputone, int inputtwo) {
		return choice.calculation(inputone, inputtwo);
	}
}
