import java.util.Scanner;

public class Arithmetic{
	public static void main(String[] args){
		Scanner input = new
		Scanner(System.in);
		
		System.out.print("Enter your first integer: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter your second integer: ");
		int num2 = input.nextInt();
		
		int sum = num1 + num1;
		int product = num1 * num2;
		int difference = num1 - num2;
		
		double quotient = (num2 != 0)?(double) num1 / num2 : 0;
		System.out.println("sum: "+ sum);
		System.out.println("product: " + product);
		System.out.println("difference: " + difference);
		if (num2 != 0){
		System.out.println("quotient: " + quotient);
	} else {
		System.out.println("quotient: undefined (division by zero)");
	    }
	}	
		
}	
		
		
		