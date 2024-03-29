//14. Find out the duplicate numbers in the given array and in which position they are found.
//            numbers=[1,2,3,1,2,4,5,6,4]
//           Output:
//           Duplicate value: 1 at index 3
//          Duplicate value: 2 at index 4
//           Duplicate value: 4 at index 8



import java.util.HashMap;

public class DuplicateNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 1, 2, 4, 5, 6, 4};

        HashMap<Integer, Integer> numberCountMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (numberCountMap.containsKey(number)) {
                int count = numberCountMap.get(number);
                numberCountMap.put(number, count + 1);
                System.out.println("Duplicate value: " + number + " at index " + i);
            } else {
                numberCountMap.put(number, 1);
            }
        }
    }
}
