//Write a program demonstrating multiple catch statements and finally block.
package String;
public class MultipleCatchBlock {

	public static void main(String[] args) {
		try {
			int ans=20/0;
			/*int arr[]=new int[10];
			arr[20]=111;*/
		}

		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NullPointerException e)
		{
			System.out.println("Null pointer exception");
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException");	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");

		}
		catch(Exception e)
		{
			System.out.println("Global Exception");

		}
		finally
		{
			System.out.println("Finally block");
		}

	}
}
/*Output
java.lang.ArithmeticException: / by zero
Finally block
 */
