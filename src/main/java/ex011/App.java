package ex011;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double radius = 7.5;

        System.out.println("Radius = "+ radius);


        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius,2);

        System.out.println("Perimeter is = "+ perimeter);
        System.out.println("Area is = " + area);
    }

}
