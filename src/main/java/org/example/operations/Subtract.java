package org.example.operations;

public class Subtract implements MathOperation {

    @Override
    public double result(double a, double b) {
        return a - b;
    }

    public Subtract() {
        System.out.println("Расчет произведен успешно");
    }
}