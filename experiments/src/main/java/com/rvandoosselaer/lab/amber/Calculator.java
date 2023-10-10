package com.rvandoosselaer.lab.amber;

public class Calculator {
    public double evaluate(Operation operation) {
        return switch (operation) {
            case Add(var first, var second) -> first + second;
            case Subtract(var first, var second) -> first - second;
            case Multiply(var first, var second) -> first * second;
            case Divide(var first, var second) -> first / second;
        };
    }

}
