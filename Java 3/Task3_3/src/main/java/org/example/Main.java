package org.example;

import java.util.Scanner;

public class Main {
    public static int charToNum(char x){
        return x - '0';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x=");
        char symbol = scanner.next().charAt(0);

        System.out.println("Результат: " + charToNum(symbol));
        scanner.close();
    }
}