package com.rvandoosselaer.lab.calculator;

public sealed interface Operation permits Add, Divide, Multiply, Subtract {
}

