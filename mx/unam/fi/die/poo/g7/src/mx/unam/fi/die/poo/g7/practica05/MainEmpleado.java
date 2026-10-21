package mx.unam.fi.die.poo.g7.practica05;

import java.util.Scanner;

/**
 * Clase principal de la Práctica 5 que permite interactuar con el usuario
 * para registrar dos empleados, calcular sus salarios anuales y aplicarles un aumento salarial.
 * @author brigada 5
 * @version 1.0
 */
public class MainEmpleado {

    /**
     * Método principal que controla la ejecución del programa para la gestión de empleados.
     * @param args Los argumentos de línea de comandos.
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("--- Empleado 1 ---");

        System.out.print("Nombre: ");
        String nombre1 = entrada.nextLine();

        System.out.print("Apellido: ");
        String apellido1 = entrada.nextLine();

        System.out.print("Salario mensual: ");
        double salario1 = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("\n--- Empleado 2 ---");

        System.out.print("Nombre: ");
        String nombre2 = entrada.nextLine();

        System.out.print("Apellido: ");
        String apellido2 = entrada.nextLine();

        System.out.print("Salario mensual: ");
        double salario2 = entrada.nextDouble();

        Empleado emp1 = new Empleado(nombre1, apellido1, salario1);
        Empleado emp2 = new Empleado(nombre2, apellido2, salario2);

        System.out.println("\n--- Salario Anual Inicial ---");
        System.out.println(emp1.getNombre() + " " + emp1.getApellido()
                + ": $" + emp1.getSalarioAnual());

        System.out.println(emp2.getNombre() + " " + emp2.getApellido()
                + ": $" + emp2.getSalarioAnual());

        double nuevoSalario1 = emp1.getSalarioMensual() * 1.10;
        emp1.setSalarioMensual(nuevoSalario1);

        double nuevoSalario2 = emp2.getSalarioMensual() * 1.10;
        emp2.setSalarioMensual(nuevoSalario2);

        System.out.println("\n--- Salario Anual con Aumento del 10% ---");
        System.out.println(emp1.getNombre() + " " + emp1.getApellido()
                + ": $" + emp1.getSalarioAnual());

        System.out.println(emp2.getNombre() + " " + emp2.getApellido()
                + ": $" + emp2.getSalarioAnual());

        entrada.close();
    }
}  