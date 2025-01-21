package ANP;
import java.util.Scanner;
public class Perfect {

	public static void main(String[] args) {
		int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = s.nextInt();
        for(int i = 1; i < n; i++)
        {
            if(n % i == 0)
            {
                sum = sum + i;
            }
        }
        if(sum == n)
        {
            System.out.println("Given number is a perfect number");
        }
        else
        {
            System.out.println("Given number is not a perfect number");
        }    
    }
    int divisor(int x)
    {
       return x;
    }
}
/*Enter the number: 6
Given number is a perfect number

Enter the number: 12
Given number is not a perfect number

*/
	
		 