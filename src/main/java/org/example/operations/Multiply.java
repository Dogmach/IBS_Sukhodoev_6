package org.example.operations;

public class Multiply implements MathOperation {

    @Override
    public double result(double a, double b) {
        return a * b;
    }

    public Multiply() {
        System.out.println("Расчет произведен успешно");
    }
}