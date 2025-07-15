package org.example;

import java.util.Scanner;

public class Main {

    public static boolean is2Digits(int x){
        return x < 100 && x > 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x=");
        int number = scanner.nextInt();

        System.out.println("Результат: " + is2Digits(number));
        scanner.close();
    }
}