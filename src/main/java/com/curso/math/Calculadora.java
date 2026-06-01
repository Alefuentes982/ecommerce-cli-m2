package com.curso.math;

public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int dividir(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero.");
        }
        return dividendo / divisor;
    }
}
