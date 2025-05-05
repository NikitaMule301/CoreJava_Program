/*Write a Java program to sort in descending order an array of given string
[A,X,D,Z,Y,C,W,B] */
package Object;
import java.util.Arrays;
import java.util.Collections;

public class DescendingOrderSort {

	public static void main(String[] args) {
		// Initialize the array of strings
		String[] array = {"A", "X", "D", "Z", "Y", "C", "W", "B"};        
		// Sort the array in descending order
		Arrays.sort(array, Collections.reverseOrder());
		// Print the sorted array
		System.out.println("Sorted array in descending order: " + Arrays.toString(array));

	}
}
/*Output
Sorted array in descending order: [Z, Y, X, W, D, C, B, A]
*/
