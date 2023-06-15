

//17. Check if the given string is palindrome or not. Palindrome means after reversing a string, it will be same.
//       Input: Civic
//        Output: true
//       Input: One
//       Output: false



import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();

        boolean isPalindrome = isPalindrome(str);
        System.out.println(str + " is a palindrome: " + isPalindrome);
    }
    private static boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleanedStr.length() - 1;

        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
