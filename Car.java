// Nancy McCoy  2242343

package mccoy9;

public class Car {

	// Data members
	private String make;
	private String model;
	private String color;
	private int year;
	private double price;

	public int unitsSold = 0;

	// Constructors
	public Car(){
		make = "";
		model = "";
		color = "";
		year = 0;
		price = 0;
		unitsSold++;
	}

	public Car(String make, String model, String color, int year, double price) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.price = price;
		this.unitsSold++;
	}

	// Setters and getters
	public String getMake() {
		return make; // Get make of car
	}

	public void setMake(String newMake) {
		make = newMake; // Set make of car
	}

	public String getModel() {
		return model; // Get model of car
	}

	public void setModel(String newModel) {
		model = newModel; // Set model of car
	}

	public int getYear() {
		return year; // Get year of car
	}

	public void setYear(int newYear) {
		year = newYear; // Set year of car
	}

	public double getPrice() {
		return price; // Get price of car
	}

	public void setPrice(double newPrice) {
		price = newPrice; // Set price of car
	}

	public String getColor() {
		return color; // Get color of car
	}

	public void setColor(String newColor) {
		color = newColor; // Set color of car
	}

	
	// toString Method
	public String toString(Car... cars) {
		return "make:" + getMake() + " " + "model:" + getModel() + " " + "year:" + getYear() + " "+ "price:" + getPrice() + " "+ "color:" + getColor();
		
		
	}

}
