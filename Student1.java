/*Create a parent class called "Person" with attributes such as name, age, and 
a method called "speak". Create a child class called "Student" that inherits 
from Person and has an additional attribute called "grade" and a method 
called "study". Create an object of the Student class and call both the 
"speak" and "study" methods.
 */
package Object;
//Parent class
class Person {
	String name;
	int age;
	// Constructor for Person
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// Method to display speaking
	public void speak() {
		System.out.println(name + " is speaking.");
	}
}
//Child class
class Student extends Person {
	String grade;
	// Constructor for Student
	public Student(String name, int age, String grade) {
		super(name, age); // Call the parent class constructor
		this.grade = grade;
	}
	// Method to display studying
	public void study() {
		System.out.println(name + " is studying in grade " + grade + ".");
	}
}
public class Student1 {

	public static void main(String[] args) {
		// Create an object of the Student class
        Student student = new Student("Nikita", 21, "A");
        // Call the speak method
        student.speak();
        // Call the study method
        student.study();
	}
}
/* Output
Nikita is speaking.
Nikita is studying in grade A.
*/
