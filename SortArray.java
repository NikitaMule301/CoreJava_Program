/*Write a Java program to sort in ascending order an array of given integers
[45,35,56,67,78,89,78,12,20] */
package Object;
import java.util.Arrays;
public class SortArray {

	public static void main(String[] args) {
		// Define the array
		int[] numbers = {45, 35, 56, 67, 78, 89, 78, 12, 20};
		// Sort the array in ascending order
		Arrays.sort(numbers);
		// Display the sorted array
		System.out.println("Sorted array in ascending order: " + Arrays.toString(numbers));

	}
}
/*Output
Sorted array in ascending order: [12, 20, 35, 45, 56, 67, 78, 78, 89]
 */
