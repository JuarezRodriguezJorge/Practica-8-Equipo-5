package mx.unam.fi.die.poo.g7.practica05;

import java.util.Scanner;

/**
 * Clase principal de la Práctica 5 que permite interactuar con el usuario
 * para registrar una fecha, mostrarla, modificarla mediante setters y consultar sus valores con getters.
 * @author brigada 5
 * @version 1.0
 */
public class MainFecha {

    /**
     * Método principal que controla la ejecución del programa para la gestión y prueba de la clase Fecha.
     * @param args Los argumentos de línea de comandos.
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Mes: ");
        int mes = entrada.nextInt();

        System.out.print("Día: ");
        int dia = entrada.nextInt();

        System.out.print("Año: ");
        int año = entrada.nextInt();

        Fecha fecha1 = new Fecha(mes, dia, año);

        System.out.print("La fecha inicial es: ");
        fecha1.mostrarFecha();

        fecha1.setMes(12);
        fecha1.setDia(25);
        fecha1.setAño(2027);

        System.out.println("\n--- Fecha modificada ---");
        System.out.println("Mes: " + fecha1.getMes());
        System.out.println("Día: " + fecha1.getDia());
        System.out.println("Año: " + fecha1.getAño());

        System.out.print("Fecha completa actualizada: ");
        fecha1.mostrarFecha();

        entrada.close();
    }
}