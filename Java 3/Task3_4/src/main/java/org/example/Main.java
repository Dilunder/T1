package org.example;

import java.util.Scanner;

public class Main {

    public static boolean isPositive(int x){
        return x >= 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x=");
        int number = scanner.nextInt();

        System.out.println("Результат: " + isPositive(number));
        scanner.close();
    }
}