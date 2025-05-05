/*2.Write a program using ArrayDeque to add book names and add,delete the values from both ends of que*/

package Core_Java;
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {
	    public static void main(String[] args) {
	        Deque<String> bookQueue = new ArrayDeque<>();

	        // Adding books to the queue
	        bookQueue.add("Book1");
	        bookQueue.add("Book2");
	        bookQueue.add("Book3");

	        System.out.println("Initial Queue: " + bookQueue);

	        // Adding books to the front of the queue
	        bookQueue.addFirst("New Book1");
	        bookQueue.addFirst("New Book2");

	        System.out.println("Queue after adding books to front: " + bookQueue);

	        // Adding books to the end of the queue
	        bookQueue.addLast("Last Book1");
	        bookQueue.addLast("Last Book2");

	        System.out.println("Queue after adding books to end: " + bookQueue);

	        // Removing books from the front of the queue
	        System.out.println("Removed from front: " + bookQueue.removeFirst());

	        System.out.println("Queue after removing from front: " + bookQueue);

	        // Removing books from the end of the queue
	        System.out.println("Removed from end: " + bookQueue.removeLast());

	        System.out.println("Queue after removing from end: " + bookQueue);
	    }
	}
/*Output:
Initial Queue: [Book1, Book2, Book3]
Queue after adding books to front: [New Book2, New Book1, Book1, Book2, Book3]
Queue after adding books to end: [New Book2, New Book1, Book1, Book2, Book3, Last Book1, Last Book2]
Removed from front: New Book2
Queue after removing from front: [New Book1, Book1, Book2, Book3, Last Book1, Last Book2]
Removed from end: Last Book2
Queue after removing from end: [New Book1, Book1, Book2, Book3, Last Book1]
 */
 