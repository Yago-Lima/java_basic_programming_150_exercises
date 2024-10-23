package ex029;

public class App {
    public static void main(String[] args) {
        String input = "37";

        System.out.println("Equivalent binary number: " +
                Integer.toString(Integer.parseInt
                                (input, 16),
                        2));
    }

}
