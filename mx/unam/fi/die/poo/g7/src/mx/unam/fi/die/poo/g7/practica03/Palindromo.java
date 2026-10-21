package mx.unam.fi.die.poo.g7.practica03;

import java.util.Scanner;

/**
 * Esta clase evalúa si un número entero de 5 dígitos ingresado por el usuario
 * es un palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda).
 * 
 * @author brigada 5
 * @version 1.0
 */
public class Palindromo {

    /**
     * Método estático que determina si un número entero de 5 dígitos es palíndromo.
     * Compara el primer dígito con el último y el segundo con el penúltimo.
     * 
     * @param num El número entero de 5 dígitos a evaluar
     * @return true si el número es palíndromo, false en caso contrario
     */
    static boolean esPalindromo(int num) {

        // Se compara el primer dígito (num / 10000) con el último dígito (num % 10)
        // y el segundo dígito ((num / 1000) % 10) con el penúltimo dígito ((num / 10) % 10).
        if (num / 10000 == num % 10 &&
            (num / 1000) % 10 == (num / 10) % 10) {

            // Si ambos extremos coinciden, retorna verdadero
            return true;
        }
        else {
            // De lo contrario, retorna falso
            return false;
        }
    }

    /**
     * Método principal o main.
     * Se encarga de solicitar al usuario un número, validar que estrictamente tenga 5 dígitos
     * mediante un ciclo do-while, realizar la conversión a entero y verificar si es palíndromo.
     * 
     * @param args Los argumentos de línea de comandos
     */
    public static void main(String[] args) {

        // Se instancia la clase Scanner para habilitar la lectura de datos introducidos por el usuario
        Scanner entrada = new Scanner(System.in);

        // Se declara una variable de tipo long para capturar el valor de entrada y validar rangos grandes
        long numero;

        // Se utiliza un ciclo do-while para repetir la solicitud mientras NO se ingrese un número de 5 dígitos
        do {
            System.out.print("Ingresa un numero de 5 digitos: ");
            numero = entrada.nextLong();

            // Se valida si el número está fuera del rango de 5 dígitos (menor o igual a 9999 o mayor o igual a 100000)
            if (numero <= 9999 || numero >= 100000) {
                System.out.println("Error: el numero debe tener 5 digitos.");
            }

        } while (numero <= 9999 || numero >= 100000);


        // Como ya se validó que el número tiene exactamente 5 dígitos, se convierte de manera segura a int
        int num = (int) numero;


        // Se invoca al método estático esPalindromo y se imprime el mensaje correspondiente según el resultado
        if (esPalindromo(num)) {
            System.out.println("Es un palindromo");
        }
        else {
            System.out.println("No es un palindromo");
        }

        // Se cierra el objeto Scanner para liberar los recursos de entrada del sistema
        entrada.close();
    }
}  