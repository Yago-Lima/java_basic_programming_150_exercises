package ex025;

public class App {
    public static void main(String[] args) {
        String input = "10";

        System.out.println("Equivalent decimal number: "+Integer.toString(
                Integer.parseInt(input, 8), 10));
    }

}
