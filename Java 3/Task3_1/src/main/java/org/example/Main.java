package org.example;

import java.util.Scanner;

public class Main {

    public static double fraction(double x){
        return x - (int)x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x=");
        double number = scanner.nextDouble();

        System.out.println("Результат: " + (float)fraction(number));
        scanner.close();
    }
}