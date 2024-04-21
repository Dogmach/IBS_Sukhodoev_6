package org.example.operations;

public class Divide implements MathOperation {

    @Override
    public double result(double a, double b) {
        return a / b;
    }

    public Divide() {
        System.out.println("Расчет произведен успешно");
    }
}