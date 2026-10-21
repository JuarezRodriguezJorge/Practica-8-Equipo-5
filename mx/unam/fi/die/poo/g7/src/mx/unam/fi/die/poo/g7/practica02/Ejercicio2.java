package mx.unam.fi.die.poo.g7.practica02;

import java.util.Scanner;

/**
 * Esta clase solicita diez números enteros al usuario, calcula su valor absoluto
 * y determina e imprime en pantalla cuál de ellos es el mayor.
 * 
 * @author brigada 5
 * @version 1.0
 */
public class Ejercicio2 {

    /**
     * Método principal o main.
     * Ejecuta el ciclo de lectura de diez números, realiza las comparaciones necesarias
     * y muestra el resultado del número mayor.
     * 
     * @param args Los argumentos de línea de comandos
     */
    public static void main(String[] args) {

        // Scanner para leer los números que ingrese el usuario
        Scanner teclado = new Scanner(System.in);

        // Variables que pide el ejercicio
        int contador = 0;
        int numero;
        int mayor = 0;

        // Se repite hasta que el usuario haya ingresado 10 números
        while (contador < 10) {

            // Pedimos un número
            System.out.print("Ingresa un numero: ");
            numero = teclado.nextInt();

            // Convertimos el número a valor absoluto
            // Ejemplo: -8 se convierte en 8
            numero = Math.abs(numero);

            // Comparamos el número con el mayor encontrado hasta ahora
            if (numero > mayor) {

                // Si es mayor, actualizamos la variable mayor
                mayor = numero;
            }

            // Aumentamos el contador para avanzar al siguiente número
            contador++;
        }

        // Esto se ejecuta solamente después de revisar los 10 números
        System.out.println("El numero mayor es: " + mayor);

        teclado.close();
    }
} 