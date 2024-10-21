package ex019;

public class App {
    public static void main(String[] args) {
        int binaryNumber = 5;

        int n = 0;

        n = binaryConversor(String.valueOf(binaryNumber));
        System.out.printf("binary numbers is: %s%n", Integer.toBinaryString(n));

    }

    private static int binaryConversor(String binaryNumber) {
        int n = 0;
        for (int i = 0; i < binaryNumber.length(); i++) {
            char b = binaryNumber.charAt(i);
            n += (int) ((b - '0') * Math.pow(2, binaryNumber.length() - 1 - i));
        }
        return n;
    }
}

