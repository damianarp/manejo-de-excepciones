package com.damianarp.pooexcepciones.ejemplo;

public class Calculadora {

    // Método para dividir dos enteros.
    // Al implementar una excepción que hereda de la clase Exception (chequeada),
    // es necesario agregar la excepción personalizada DivisionPorZeroException, mediante la palabra reservada throws, a la definición del método para propagarla.
    public double dividir(int dividendo, int divisor) throws DivisionPorZeroException {
        // Validamos si el divisor es 0 para lanzar la excepción.
        if (divisor == 0) {
            throw new DivisionPorZeroException("Hey! No se puede dividir por cero!"); // Lanzamos una nueva instancia de la excepción DivisionPorZeroException.
        }
        return dividendo/(double)divisor;
    }
}
