package org.example;

import org.example.operations.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод чисел и математического знака
        System.out.print("Введите первое число: ");
        double number1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double number2 = scanner.nextDouble();

        System.out.print("Введите математический знак (+, -, *, /): ");
        String operator = scanner.next();

        double result = 0;
        MathOperation someOper;

        try {
            switch (operator) {
                case "+":
                    someOper = new Sum();
                    break;
                case "-":
                    someOper = new Subtract();
                    break;
                case "*":
                    someOper = new Multiply();
                    break;
                case "/":

                    if (number2 == 0) {
                        throw new IllegalArgumentException("Делить на ноль нельзя");
                    }
                    someOper = new Divide();
                    break;
                default:

                    throw new IllegalArgumentException("Некорректный математический знак. Используйте знаки + - * /");
            }
            result = someOper.result(number1, number2);
            System.out.printf("Результат: " + " %.4f%n", result);

        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}