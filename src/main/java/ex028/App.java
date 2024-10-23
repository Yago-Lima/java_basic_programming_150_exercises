package ex028;

public class App {
    public static void main(String[] args) {
        String input = "25";

        System.out.println("Equivalent hexadecimal number: " +
                Integer.toString(Integer.parseInt
                                (input, 16),
                        10));
    }

}
