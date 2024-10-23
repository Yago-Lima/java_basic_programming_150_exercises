package ex026;

public class App {
    public static void main(String[] args) {
        String input = "7";

        System.out.println("Equivalent binary number: " + Integer
                .toString(Integer
                        .parseInt(input, 8), 2));
    }

}
