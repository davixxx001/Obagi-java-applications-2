import java.util.Scanner; // Import Scanner for user input

public class ArithmeticSmallestLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter third integer: ");
        int num3 = input.nextInt();

        // Calculating sum, average, and product
        int sum = num1 + num2 + num3;
        int average = sum / 3; // Integer division
        int product = num1 * num2 * num3;

        // Finding the smallest number
        int smallest = Math.min(num1, Math.min(num2, num3));

        // Finding the largest number
        int largest = Math.max(num1, Math.max(num2, num3));

        // Displaying results
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Product: " + product);
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);

        input.close(); // Close Scanner
    }
}