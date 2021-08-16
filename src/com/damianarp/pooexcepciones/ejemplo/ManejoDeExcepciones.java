package com.damianarp.pooexcepciones.ejemplo;

import javax.swing.*;

public class ManejoDeExcepciones {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Ingrese un número entero por el cuál dividir:"); // Mostramos un panel para ingresar el numero divisor.
        int divisor;
        try { // Atrapamos la excepción
            divisor = Integer.parseInt(valor); // Lo convertimos a int.
            int division = 10/divisor;
            System.out.println(division);
        } catch (NumberFormatException nfe) {
            System.out.println("El valor ingresado no es numérico. " + nfe.getMessage()); // Mostramos el mensaje de la excepción.
            main(args); // Se vuelve a ejecutar el método main.
        } catch (ArithmeticException ae) {
            System.out.println("No se puede dividir por cero. " + ae.getMessage());
            main(args);
        } finally {
            System.out.println("\nEl bloque \"finally\" es opcional, sirve para que se ejecute una tarea,\n" +
                    "independientemente de si hubo un error o no.\n" +
                    "Generalmente, se usa para cerrar recursos (un archivo, conexión a base de datos, etc).\n");
        }
        System.out.println("Continuamos con el flujo de ejecución del programa!");
    }
}
