// Write a java program for  Unboxing.(all types).
package String;
public class UnboxingExample {

	public static void main(String[] args) {
		 // Creating wrapper objects
        Byte byteObj = 10;          
        Short shortObj = 20;
        Integer intObj = 30;
        Long longObj = 40L;
        Float floatObj = 50.5f;
        Double doubleObj = 60.6;
        Character charObj = 'A';
        Boolean boolObj = true;

        // Automatic Unboxing - Converting wrapper objects to primitive types
        byte byteValue = byteObj;   // Unboxing
        short shortValue = shortObj;
        int intValue = intObj;
        long longValue = longObj;
        float floatValue = floatObj;
        double doubleValue = doubleObj;
        char charValue = charObj;
        boolean boolValue = boolObj;

        // Displaying the results
        System.out.println("byte value: " + byteValue);
        System.out.println("short value: " + shortValue);
        System.out.println("int value: " + intValue);
        System.out.println("long value: " + longValue);
        System.out.println("float value: " + floatValue);
        System.out.println("double value: " + doubleValue);
        System.out.println("char value: " + charValue);
        System.out.println("boolean value: " + boolValue);
	}
}
/*Output
byte value: 10
short value: 20
int value: 30
long value: 40
float value: 50.5
double value: 60.6
char value: A
boolean value: true
*/
