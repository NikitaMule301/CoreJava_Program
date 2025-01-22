//Write java program to invoke current class method using this keyword
package Object;

public class CurrentClass {
	 void display()
	    {
	        // call show() function
	        this.show();
	 
	        System.out.println("Display function");
	    }
	 
	    void show()
	    {
	        System.out.println("Show function");
	    }
	public static void main(String[] args) {
		CurrentClass cc = new CurrentClass();
        cc.display();
	}
}
/*Output:
Show function
Display function
*/
