package com.curso.math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    // Fixture: instancia compartida que se recrea antes de cada prueba
    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    void sumar_ok() {
        // Arrange & Act
        int resultado = calculadora.sumar(3, 5);

        // Assert
        assertEquals(8, resultado, "3 + 5 debe ser 8");
    }

    @Test
    void dividir_por_cero_lanza_excepcion() {
        // Assert: se espera que lanze IllegalArgumentException
        assertThrows(
            IllegalArgumentException.class,
            () -> calculadora.dividir(10, 0),
            "Dividir por cero debe lanzar IllegalArgumentException"
        );
    }
}
