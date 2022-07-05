package mycodes2;

public class Main {

	public static void main(String[] args) {
		Car porsche= new Car();
		Car holden= new Car();
		System.out.println("Model = "+porsche.getModel());
		porsche.setModel("carrera");
		System.out.println("Model = "+porsche.getModel());
		porsche.setModel("911");
		System.out.println("Model = "+porsche.getModel());

	}

}
