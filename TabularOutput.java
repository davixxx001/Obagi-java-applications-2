public class TabularOutput {

    public static void main(String[] args) {
        // Print the table header
        System.out.printf("%-10s %-10s %-10s\n", "Number", "Square", "Cube");

        // Loop through numbers 1 to 10
        for (int i = 1; i <= 10; i++) {
            int square = i * i;   // Calculate square
            int cube = i * i * i; // Calculate cube

            // Print the number, square, and cube in tabular format
            System.out.printf("%-10d %-10d %-10d\n", i, square, cube);
        }
    }
}
