package ex022;

public class App {
    public static void main(String[] args) {
        String input = "100";

        System.out.println("Decimal Number: "+binaryConversor(input));
    }
    private static int binaryConversor(String binaryNumber) {
        int n = 0;
        for (int i = 0; i < binaryNumber.length() ; i++) {
            char b = binaryNumber.charAt(i);
            n += (int) ((b - '0') * Math.pow(2,binaryNumber.length() - 1 - i));
        }
        return n;
    }
}
