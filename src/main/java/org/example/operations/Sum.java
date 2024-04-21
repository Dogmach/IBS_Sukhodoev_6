package org.example.operations;

public class Sum implements MathOperation {

    @Override
    public double result(double a, double b) {
        return a + b;
    }

    public Sum() {
        System.out.println("Расчет произведен успешно");
    }

}