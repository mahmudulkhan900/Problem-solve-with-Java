import java.util.Scanner;

public class ContinuousSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        boolean quit = false;

        System.out.println("Enter integer numbers to calculate their sum. Enter 'q' to quit.");

        while (!quit) {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                quit = true;
            } else {
                try {
                    int number = Integer.parseInt(input);
                    sum += number;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a valid integer or 'q' to quit.");
                }
            }
        }

        System.out.println("Sum of the numbers: " + sum);
        scanner.close();
    }
}
