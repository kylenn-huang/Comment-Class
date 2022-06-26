package com.hky;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        double[] scores = new double[]{89.9, 99.6, 45.6, 44.0};
        int[] ages = new int[]{12, 24, 35};
        int[] ids = {12, 24, 35};
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        System.out.println("=====================================");
        for (double element : scores) {
            System.out.println(element);
        }
        System.out.println("=============================================");
        System.out.println(Arrays.toString(scores));
        System.out.println("=============================================");
        Arrays.stream(scores).forEach(score -> System.out.println(score));
    }

}
