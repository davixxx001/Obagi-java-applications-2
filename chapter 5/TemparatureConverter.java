import java.util.Scanner;

public class TemperatureConverter {

    public static double celsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    public static double fahrenheit(double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1 to convert Fahrenheit to Celsius\nEnter 2 to convert Celsius to Fahrenheit: ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Enter Fahrenheit temperature: ");
            double f = input.nextDouble();
            System.out.printf("Celsius: %.2f%n", celsius(f));
        } else if (choice == 2) {
            System.out.print("Enter Celsius temperature: ");
            double c = input.nextDouble();
            System.out.printf("Fahrenheit: %.2f%n", fahrenheit(c));
        } else {
            System.out.println("Invalid choice.");
        }
    }
}