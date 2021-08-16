package com.damianarp.pooexcepciones.ejemplo;

import javax.swing.*;

public class ManejoDeExcepciones {
    // Al implementar el método dividir() que arroja la excepción personalizada DivisionPorZeroException,
    // y que hereda de la clase Exception (por lo que es chequeada),
    // es necesario usar el método dividir() dentro del bloque try y capturar la DivisionPorZeroException en el catch.
    // Otra manera alternativa a esto es directamente agregar la excepción personalizada DivisionPorZeroException,
    // mediante la palabra reservada throws, a la definición del método main para propagarla: public static void main(String[] args) throws DivisionPorZeroException {}.
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();

        String valor = JOptionPane.showInputDialog("Ingrese un número entero por el cuál dividir:"); // Mostramos un panel para ingresar el numero divisor.
        int divisor;
        double division;
        try { // Atrapamos las excepciones.
            divisor = Integer.parseInt(valor); // Lo convertimos a int.
            division = cal.dividir(10, divisor);
            System.out.println(division);
        } catch (NumberFormatException nfe) {
            System.out.println("El valor ingresado no es numérico. " + nfe.getMessage()); // Mostramos el mensaje de la excepción.
            main(args); // Se vuelve a ejecutar el método main.
        } catch (DivisionPorZeroException dpze) {
            System.out.println("Excepción en tiempo de ejecución:  " + dpze.getMessage());
            main(args);
        } finally {
            System.out.println("\nEl bloque \"finally\" es opcional, sirve para que se ejecute una tarea,\n" +
                    "independientemente de si hubo un error o no.\n" +
                    "Generalmente, se usa para cerrar recursos (un archivo, conexión a base de datos, etc).\n");
        }
        System.out.println("Continuamos con el flujo de ejecución del programa!");
    }
}
