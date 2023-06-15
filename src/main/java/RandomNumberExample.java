import java.util.Arrays;
import java.util.Random;

public class RandomNumberExample {
    public static void main(String[] args) {
        int[] numbers = generateRandomNumbers(10);

        System.out.println("Numbers from the array:");
        for (int number : numbers) {
            System.out.println(number);
        }

        int max = findMaxNumber(numbers);
        int min = findMinNumber(numbers);

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }

    private static int[] generateRandomNumbers(int count) {
        int[] numbers = new int[count];
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            numbers[i] = random.nextInt();
        }
        return numbers;
    }

    private static int findMaxNumber(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }
    private static int findMinNumber(int[] arr) {
        return Arrays.stream(arr).min().getAsInt();
    }
}
