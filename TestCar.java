// Nancy McCoy  2242343

package mccoy9;

public class TestCar {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		//Car 1
		car1.setMake("Mustang");
		car1.setModel("Shelby");
		car1.setYear(2016);
		car1.setPrice(50000);
		car1.setColor("Red");
		car1.unitsSold++;
		
		//Car 2
		car2.setMake("Skyline");
		car2.setModel("Nissan");
		car2.setYear(2000);
		car2.setPrice(70000);
		car2.setColor("White");
		car2.unitsSold++;
		
		//Car 3
		car3.setMake("Impala");
		car3.setModel("Chevrolet");
		car3.setYear(1967);
		car3.setPrice(30000);
		car3.setColor("Black");
		car3.unitsSold++;
		
		
		evaluateCars(car1, car2, car3);
	}

	
	public static void evaluateCars(Car car1, Car car2, Car car3) {
		System.out.println(car1.toString(car1));
		System.out.println(car2.toString(car2));
		System.out.println(car3.toString(car3));
		double carTotal = car1.getPrice() + car2.getPrice() + car3.getPrice();
		System.out.println("Your" + " " + car1.unitsSold  + " " + "cars are worth" + "  " + carTotal);
		
}
}
