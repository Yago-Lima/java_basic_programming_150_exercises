package ex024;

public class App {
    public static void main(String[] args) {
        String input = "111";

        System.out.println("Octal number: "+Integer.toString(
                Integer.parseInt(input, 2), 8));
    }

}
