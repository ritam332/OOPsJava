package mycodes2;

public class TestCode029 {

	public static void main(String[] args) {
		CodeTest029SumCalculator calculator = new CodeTest029SumCalculator();
		calculator.setFirstNumber(5.0);
		calculator.setSecondNumber(4);
		System.out.println("add= " + calculator.getAdditionResult());
		System.out.println("subtract= " + calculator.getSubtractionResult());
		calculator.setFirstNumber(5.25);
		calculator.setSecondNumber(0);
		System.out.println("multiply= " + calculator.getMultiplicationResult());
		System.out.println("divide= " + calculator.getDivisionResult());

	}

}
