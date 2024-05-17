package org.august;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int n = scanner.nextInt();

        SumCalculator calculator = new SumCalculator();
        int result = calculator.sum(n);

        System.out.println("Сума чисел від 1 до " + n + " дорівнює " + result);
    }
}
