
//11. Find out the second largest element of the given array
//numbers=[5,3,9,7,4,1,8]

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 9, 7, 4, 1, 8};
        int secondLargest = findSecondLargest(numbers);

        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("Second largest element: " + secondLargest);
        } else {
            System.out.println("No second largest element found.");
        }
    }

    private static int findSecondLargest(int[] arr) {
        Arrays.sort(arr);

        int length = arr.length;
        if (length < 2) {
            return Integer.MIN_VALUE;
        }

        return arr[length - 2];
    }
}
