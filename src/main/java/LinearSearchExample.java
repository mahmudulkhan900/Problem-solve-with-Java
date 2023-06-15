

//5. Write a program that will find your key is found in the given array using linear search method
//       numbers=[1,6,9,3,5,4,7]
//       key=5

public class LinearSearchExample {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 9, 3, 5, 4, 7};
        int key = 5;
        int index = linearSearch(numbers, key);
        if (index != -1) {
            System.out.println("Key " + key + " found at index " + index);
        } else {
            System.out.println("Key " + key + " not found in the array.");
        }
    }

    private static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}