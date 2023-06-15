
//Extract the OTP from the SMS. "Your one time password is 246148. Don't share this code with anyone \r\nBvwt3f8js2S"

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OTPExtractor {
    public static void main(String[] args) {
        String sms = "Your one time password is 246148. Don't share this code with anyone \r\nBvwt3f8js2S";

        String otp = extractOTP(sms);
        System.out.println("OTP: " + otp);
    }

    private static String extractOTP(String sms) {
        Pattern pattern = Pattern.compile("\\b\\d{6}\\b");
        Matcher matcher = pattern.matcher(sms);

        if (matcher.find()) {
            return matcher.group();
        }

        return null;
    }
}
