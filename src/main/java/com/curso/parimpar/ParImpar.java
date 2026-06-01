package com.curso.parimpar;

/**
 * Clase implementada con TDD.
 * Paso 1 (ROJO): Se escribio el test esPar(4)==true antes de esta clase.
 * Paso 2 (VERDE): Se implemento el minimo codigo para pasar ambos tests.
 * Paso 3 (REFACTOR): No fue necesario refactorizar; el metodo ya es simple y claro.
 */
public class ParImpar {

    public boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
