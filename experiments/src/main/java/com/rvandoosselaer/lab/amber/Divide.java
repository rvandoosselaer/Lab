package com.rvandoosselaer.lab.amber;

public record Divide(double first, double second) implements Operation {

    public Divide {
        if (second == 0.0)
            throw new IllegalArgumentException();
    }

}
