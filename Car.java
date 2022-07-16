package mycodes2;

public class Car {
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String color;

	public void setModel(String model) {
	    String validModel=model.toLowerCase();
	    if (validModel.equals("carrera") || 
	    		validModel.equals("commodore")) {
	    	this.model= model;
		}else {
			this.model= "Unknown";
		}
	}
	
	public String getModel() {
		return this.model;
	}
	
	
	//..................Main Method...............................
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
