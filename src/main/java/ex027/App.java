package ex027;

public class App {
    public static void main(String[] args) {
        String input = "100";

        System.out.println("Equivalent hexadecimal number: " +
                Integer.toString(Integer.parseInt
                                (input, 8),
                        16));
    }

}
