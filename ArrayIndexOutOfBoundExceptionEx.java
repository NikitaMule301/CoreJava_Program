//Write a program using exception handling to handle array index out of bounds.
package String;
public class ArrayIndexOutOfBoundExceptionEx {

	public static void main(String[] args) {
		try
		{
			int arr[]=new int[10];
			arr[20]=111; 
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("hi");	

	}
}
/*Output
java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 10
hi
 */
