// Write java program to check candidate eligible for voting or not
package Object;
import java.util.Scanner;
public class VotingEligiblity {

	public static void main(String[] args) {
		// Create a Scanner object for user input
		Scanner scanner=new Scanner(System.in);
		// Prompt the user to enter their age
		System.out.println("Enter a age");
		int age=scanner.nextInt();
		// Check eligibility for voting
		if(age>=18) {
			System.out.println("You are eligible for voting");
		}
		else {
			System.out.println("You are not eligible for voting");
		}
	}
}
/*
Output
Enter a age
10
You are not eligible for voting
Enter a age
25
You are eligible for voting
 */
