/*Create a parent class called "Vehicle" with attributes such as brand, model,
year, and a method called "drive". Create a child class called "Car" that 
inherits from Vehicle and has an additional attribute called "color" and a 
method called "honk". Create an object of the Car class and call both the 
"drive" and "honk" methods.
 */
package Object;
//Parent class
class Vehicle {
	String brand;
	String model;
	int year;

	public void drive() {
		System.out.println("The vehicle is now being driven.");
	}
}

//Child class
class Car extends Vehicle {
	String color;

	public void honk() {
		System.out.println("Beep beep! The car is honking.");
	}
}
public class Car1 {

	public static void main(String[] args) {
		// Create an object of the Car class
		Car myCar = new Car();
		myCar.brand = "Tesla";
		myCar.model = "S";
		myCar.year = 2026;
		myCar.color = "White";

		// Call the drive and honk methods
		myCar.drive();
		myCar.honk();
	}
}
/* Output
The vehicle is now being driven.
Beep beep! The car is honking.
*/
