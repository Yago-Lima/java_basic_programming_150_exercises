package ex012;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        double[] nums = {5,7,2};

        System.out.println(Arrays.stream(nums).average());

    }

}
