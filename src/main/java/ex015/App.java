package ex015;

public class App {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int aux = 0;

        aux = a;
        a = b;
        b = aux;

        System.out.println("a = "+a);
        System.out.println("b = "+b);


    }

}
