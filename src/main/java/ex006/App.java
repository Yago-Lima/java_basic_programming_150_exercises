package ex006;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input Fist number: ");
        int num1 = sc.nextInt();
        System.out.print("Input Second number: ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " + " + num2 + " = "+ (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
    }

}
