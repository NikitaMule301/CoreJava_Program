// Write a program demonstrating  Exception handling using try catch for Arithmatic Exception.
package String;
public class ArithmaticException {

	public static void main(String[] args) {
		try 
		{
			int a=10/0; 
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException"+e);
		}	
	}
}
/*Output
ArithmeticExceptionjava.lang.ArithmeticException: / by zero
 */
