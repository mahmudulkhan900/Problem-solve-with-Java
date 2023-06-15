public class DecimalExample {
    public static void main(String[] args) {
        double a = 15.5276;

        String formattedValue = String.format("%.2f", a);
        System.out.println("a = " + formattedValue);
    }
}
