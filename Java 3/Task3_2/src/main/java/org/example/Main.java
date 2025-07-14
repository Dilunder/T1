package org.example;

import java.util.Scanner;

public class Main {

    public static int sumLastNums(int x){
        return x % 10 + x % 100 / 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x=");
        int number = scanner.nextInt();

        System.out.println("Результат: " + sumLastNums(number));
        scanner.close();
    }
}