package org.example;

import java.util.Scanner;

public class Main {

    public static boolean isUpperCase(char x){
        return x <= 'Z' && x >= 'A';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x=");
        char symbol = scanner.next().charAt(0);

        System.out.println("Результат: " + isUpperCase(symbol));
        scanner.close();
    }
}