package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a  < b) {
            NumberGenerator.creates(a , b);
        } else {
            NumberGenerator.creates(b, a );
        }
    }
}
