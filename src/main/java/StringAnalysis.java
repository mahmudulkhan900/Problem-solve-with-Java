

//15. Count number of words, number of characters without spaces, number of vowels and consonant from the given string:
//        "I live in Bangladesh"
//       Output:
//        Number of words: 4
//       Number of chars without spaces: 17
//       Number of vowels: 7
//        Number of consonant: 10


public class StringAnalysis {
    public static void main(String[] args) {
        String str = "I live in Bangladesh";

        int wordCount = countWords(str);
        int charCountWithoutSpaces = countCharactersWithoutSpaces(str);
        int vowelCount = countVowels(str);
        int consonantCount = countConsonants(str);

        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of characters without spaces: " + charCountWithoutSpaces);
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }

    private static int countWords(String str) {
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    private static int countCharactersWithoutSpaces(String str) {
        String stringWithoutSpaces = str.replaceAll("\\s+", "");
        return stringWithoutSpaces.length();
    }

    private static int countVowels(String str) {
        int count = 0;
        String lowercaseStr = str.toLowerCase();
        for (int i = 0; i < lowercaseStr.length(); i++) {
            char ch = lowercaseStr.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    private static int countConsonants(String str) {
        int count = 0;
        String lowercaseStr = str.toLowerCase();
        for (int i = 0; i < lowercaseStr.length(); i++) {
            char ch = lowercaseStr.charAt(i);
            if (ch >= 'a' && ch <= 'z' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                count++;
            }
        }
        return count;
    }
}
