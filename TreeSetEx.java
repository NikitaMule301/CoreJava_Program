/*3.Write a program using TreeSet insert Integer values and print them.*/

package Core_Java;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
	        TreeSet<Integer> numbers = new TreeSet<>();

	        // Inserting numbers into the TreeSet
	        numbers.add(10);
	        numbers.add(5);
	        numbers.add(20);
	        numbers.add(15);
	        numbers.add(10); // Duplicate value, will be ignored

	        System.out.println("TreeSet: " + numbers);
	    }
	}

/*Output:
 TreeSet: [5, 10, 15, 20]
 */
