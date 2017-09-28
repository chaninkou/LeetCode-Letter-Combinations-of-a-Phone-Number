package example16;
import java.util.Scanner;
/*   
    Author: Chan In Kou
    Purpose: The Display show the quadratic equation solver
*/
public class Example16 
{ 
    public static void main(String[] args) 
	{
		//Create a Scanner
		Scanner in = new Scanner(System.in);
		
		// prompts the user to enter values for a, b, and c 
		System.out.print("Enter a, b, and c: ");
        
		//Declare variables
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		double r1;
		double r2;
		double disCriminant = (Math.pow(b,2) - (4 * a * c)); 
		
		// quadrtic equation
		r1 = ((-b + Math.sqrt(Math.pow(b,2) - (4 * a * c))) / (2 * a));
		
        r2 = ((-b - Math.sqrt(Math.pow(b,2) - (4 * a * c))) / (2 * a));
		
		//If the discriminant is positive, the equation has two real roots
		if (disCriminant > 0)
		{
			System.out.println("The roots are " + r1 + " and "+ r2);
		}
		
		// If the discriminant is zero, the equation has one root
		if (disCriminant == 0) 
		{
			System.out.println("The roots are " + r1);
		}
		
		//If it is negative, the equation has no real roots
		if (disCriminant < 0) 
		{
			System.out.println("The equation has no real roots.");
		}
	} 
}