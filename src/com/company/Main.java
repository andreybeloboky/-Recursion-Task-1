package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if (A < B) {
            Recursion.methodReuse(A, B);
        } else {
            Recursion.methodReuse(B, A);
        }
    }
}
