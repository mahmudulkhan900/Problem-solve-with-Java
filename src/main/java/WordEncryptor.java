public class WordEncryptor {
    public static void main(String[] args) {
        String word = "ROADTOSDET";
        String encryptedWord = encrypt(word);
        System.out.println("Encrypted Word: " + encryptedWord);
    }

    private static String encrypt(String word) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                int encryptedValue = ((c - 'A' + 5) % 26) + 'A';
                encrypted.append((char) encryptedValue);
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }
}
