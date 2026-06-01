package com.curso.parimpar;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParImparTest {

    // Test 1 (ciclo ROJO -> VERDE): numero par debe retornar true
    @Test
    void esPar_con_numero_par_retorna_true() {
        ParImpar parImpar = new ParImpar();
        assertTrue(parImpar.esPar(4), "4 es par, debe retornar true");
    }

    // Test 2 (ciclo ROJO -> VERDE): numero impar debe retornar false
    @Test
    void esPar_con_numero_impar_retorna_false() {
        ParImpar parImpar = new ParImpar();
        assertFalse(parImpar.esPar(5), "5 es impar, debe retornar false");
    }
}
