//Write  a java program for Autoboxing.(All Primitive Types)
package String;
public class AutoboxingExample {

	public static void main(String[] args) {
		// byte to Byte
        byte byteValue = 10;
        Byte byteObj = byteValue;

        // short to Short
        short shortValue = 20;
        Short shortObj = shortValue;

        // int to Integer
        int intValue = 30;
        Integer intObj = intValue;

        // long to Long
        long longValue = 40L;
        Long longObj = longValue;

        // float to Float
        float floatValue = 50.5f;
        Float floatObj = floatValue;

        // double to Double
        double doubleValue = 60.6;
        Double doubleObj = doubleValue;

        // char to Character
        char charValue = 'A';
        Character charObj = charValue;

        // boolean to Boolean
        boolean boolValue = true;
        Boolean boolObj = boolValue;

        // Displaying the results
        System.out.println("Byte object: " + byteObj);
        System.out.println("Short object: " + shortObj);
        System.out.println("Integer object: " + intObj);
        System.out.println("Long object: " + longObj);
        System.out.println("Float object: " + floatObj);
        System.out.println("Double object: " + doubleObj);
        System.out.println("Character object: " + charObj);
        System.out.println("Boolean object: " + boolObj);
	}
}
/*Output
Byte object: 10
Short object: 20
Integer object: 30
Long object: 40
Float object: 50.5
Double object: 60.6
Character object: A
Boolean object: true
*/
