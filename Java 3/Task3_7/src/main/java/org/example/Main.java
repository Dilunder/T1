package org.example;

import java.util.Scanner;

import static java.lang.Integer.max;
import static java.lang.Integer.min;

public class Main {

    public static boolean isInRange(int a, int b, int num){
        return min(a, b) <= num && max(a, b) >= num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a=");
        int leftBorder = scanner.nextInt();
        System.out.print("b=");
        int rightBorder = scanner.nextInt();
        System.out.print("num=");
        int number = scanner.nextInt();

        System.out.println("Результат: " + isInRange(leftBorder, rightBorder, number));
        scanner.close();
    }
}