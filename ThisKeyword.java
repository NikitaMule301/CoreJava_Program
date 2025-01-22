//Write a Java Program  to pass  this keyword as argument in the constructor call
package Object;
class A {
	ThisKeyword obj;
	A(ThisKeyword obj)
	{
		this.obj = obj;
		obj.display();
	}
}
public class ThisKeyword {
	int x = 5;
	ThisKeyword() { 
		A obj = new A(this); 
	}
	void display()
	{
		System.out.println("Value of x in Class B : " + x);
	}

	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword();

	}
}
/*Output:
Value of x in Class B : 5
 */
