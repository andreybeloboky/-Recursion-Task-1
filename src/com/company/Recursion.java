package com.company;

/*
 * @param A- user value;
 * @param B - user value;
 */
public class Recursion {
    public static void methodReuse(int A, int B) {
        if (A <= B) {
            System.out.println(A);
            methodReuse(A + 1, B);
        }
    }
}
