package com.rvandoosselaer.lab.calculator;

/**
 * Usage of records to store data and only data.
 * Validate the data at the boundaries -> {@link Divide}
 * Record matching and pattern matching -> {@link Calculator#evaluate(Operation)}
 * Use sealed interface to limit the Operation implementations and to omit using default in the switch statement
 */
public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Operation addition = new Add(1, 1);
        Operation subtraction = new Subtract(2, 4);
        Operation multiplication = new Multiply(5, 3);
        Operation division = new Divide(6, 2);

        System.out.println(calculator.evaluate(addition));
        System.out.println(calculator.evaluate(subtraction));
        System.out.println(calculator.evaluate(multiplication));
        System.out.println(calculator.evaluate(division));
    }

}
