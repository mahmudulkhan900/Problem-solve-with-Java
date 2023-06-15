import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TotalCostCalculator {
    public static void main(String[] args) {
        String paragraph = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?";

        int laptopPrice = extractPrice(paragraph, "laptop");
        int mousePrice = extractPrice(paragraph, "mouse");

        if (laptopPrice != -1 && mousePrice != -1) {
            int totalPrice = laptopPrice + mousePrice;
            double discount = 0.15 * totalPrice;
            double discountedPrice = totalPrice - discount;

            System.out.println("Total Cost: " + discountedPrice + " tk");
        } else {
            System.out.println("Price not found for laptop or mouse");
        }
    }

    private static int extractPrice(String paragraph, String itemName) {
        Pattern pattern = Pattern.compile("\\b\\d+\\b");
        Matcher matcher = pattern.matcher(paragraph);

        while (matcher.find()) {
            String number = matcher.group();
            if (paragraph.contains(itemName) && paragraph.contains(number)) {
                return Integer.parseInt(number);
            }
        }

        return -1;
    }
}
