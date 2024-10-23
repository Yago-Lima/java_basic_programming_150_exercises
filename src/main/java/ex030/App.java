package ex030;

public class App {
    public static void main(String[] args) {
        String input = "40";

        System.out.println("Equivalent octal number: " +
                Integer.toString(Integer.parseInt
                                (input, 16),
                        8));
    }

}
