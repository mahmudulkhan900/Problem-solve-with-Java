import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 9, 3, 5, 4, 7};
        int key = 5;

        Arrays.sort(numbers);
        int index = Arrays.binarySearch(numbers, key);

        if (index >= 0) {
            System.out.println("Key " + key + " found at index " + index);
        } else {
            System.out.println("Key " + key + " not found in the array.");
        }
    }
}
