package ex018;

public class App {
    public static void main(String[] args) {
        String firstBinaryNumber = "10";
        String secondBinaryNumber = "11";

        int n1 = 0;
        int n2 = 0;

        n1 = binaryConversor(firstBinaryNumber);
        n2 = binaryConversor(secondBinaryNumber);
        int res = n1 * n2;
        System.out.printf("Multiply of two binary numbers: %s%n", Integer.toBinaryString(res));

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
