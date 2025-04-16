import java.util.Scanner;

public class ArithmeticOperations{
	public static void main(String[] args){
		Scanner input = new
		Scanner(System.in);
		
		System.out.print("enter first integer");
		int a = input.nextInt();
		
		System.out.print("enter first integer");
		int b = input.nextInt();
		
		System.out.printf("Sum:%d%n",a + b);
		System.out.printf("Product:%d%n", a * b);
		System.out.printf("Difference: %d%n",a - b);
		System.out.printf("Quotient:%d%n",a / b);
	}
}
		
		