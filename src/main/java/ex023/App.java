package ex023;

public class App {
    /**
     * Analyzing the code step by step:
     * <p>
     * - The method Integer.parseInt(input, 2) converts the string `input`,
     * which represents a binary number (base 2), into its equivalent integer value.
     * The parameter "2" indicates that the provided string is in binary format.
     * <p>
     * - The integer returned by Integer.parseInt is then passed as an argument to
     * the method Integer.toString(..., 16), which converts the integer into a string
     * representing the corresponding value in hexadecimal (base 16). The second parameter
     * "16" specifies that the conversion should be to hexadecimal.
     * <p>
     * - Finally, the result of the conversion is concatenated with the message "HexaDecimal value: "
     * and printed to the console using System.out.println.
     * <p>
     * In summary, the code converts a binary string to its hexadecimal equivalent
     * and displays the result in the console.
     */

    public static void main(String[] args) {
        String input = "1101";

        System.out.println(
                "HexaDecimal value: " + Integer.toString
                        (Integer.parseInt(input, 2), 16));
    }

}
