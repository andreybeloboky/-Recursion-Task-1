package com.company;

/*
 * @param a - user value;
 * @param b - user value;
 */
public class NumberGenerator {
    public static void creates(int a, int b) {
        if (a <= b) {
            System.out.println(b);
            creates(a + 1, b);
        }
    }
}
