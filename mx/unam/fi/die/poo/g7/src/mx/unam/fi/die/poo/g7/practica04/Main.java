package mx.unam.fi.die.poo.g7.practica04;

import java.util.Scanner;

/**
 * Clase principal que ejecuta la aplicación de la Práctica 4 para el análisis de palabras.
 * @author brigada 5
 * @version 1.0
 */
public class Main {

    /**
     * Método principal o main que interactúa con el usuario para capturar la oración
     * y desplegar los resultados del análisis.
     * @param args Los argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una oración para analizar: ");
        String oracion = scanner.nextLine();

        AnalizadorPalabras analizador = new AnalizadorPalabras(oracion);
        int total = analizador.contarPalabras();

        System.out.println("\nTotal de palabras: " + total);
        System.out.println("Palabras distintas: " + analizador.obtenerNumeroPalabrasDistintas());
        System.out.println("Palabras diferentes duplicadas: " + analizador.obtenerNumeroDuplicadas());

        analizador.mostrarResultado();

        System.out.println("\nDuplicadas sin ordenar:");
        analizador.mostrarDuplicadasSinOrdenar();

        System.out.println("\nDuplicadas en orden alfabético:");
        analizador.mostrarDuplicadasOrdenadas();

        scanner.close();
    }
}   