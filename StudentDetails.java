/*1.Write a program using Vector to store the list of students details and print the details.*/
package Core_Java;
import java.util.Vector;

public class StudentDetails {
  public static void main(String[] args) {
		Vector<String> studentName = new Vector<>();
        Vector<Integer> studentAge = new Vector<>();
        Vector<String> studentCourse = new Vector<>();

        // Adding students to the vector
        studentName.add("ABC");
        studentAge.add(20);
        studentCourse.add("CS");

        studentName.add("XYZ");
        studentAge.add(22);
        studentCourse.add("Math");

        studentName.add("PQR");
        studentAge.add(21);
        studentCourse.add("Physics");

        // Printing student details
        System.out.println("Student Details:");
        for (int i = 0; i < studentName.size(); i++) {
            System.out.println("Student " + (i + 1) + ": Name = " + studentName.get(i) + ", Age = " + studentAge.get(i) + ", Course = " + studentCourse.get(i));
        }
    }
}
/*Output:
Student Details:
Student 1: Name = ABC, Age = 20, Course = CS
Student 2: Name = XYZ, Age = 22, Course = Math
Student 3: Name = PQR, Age = 21, Course = Physics
 */


	
