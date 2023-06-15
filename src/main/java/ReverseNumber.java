
//13. Take any number as input and print the reverse of the number
//        input: 12345
//       output: 54321


import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed number: " + reversedNumber);
    }

    private static int reverseNumber(int num) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }
}
