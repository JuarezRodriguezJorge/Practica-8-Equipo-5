package mx.unam.fi.die.poo.g7.practica02;

/**
 * Esta clase imprime una tabla de valores multiplicando un número n (del 1 al 5)
 * por 10, 100 y 1000 utilizando un ciclo for y tabulaciones.
 * 
 * @author brigada 5
 * @version 1.0
 */
public class TablaValores {

    /**
     * Método principal o main.
     * Ejecuta la impresión de la cabecera y el ciclo repetitivo para generar la tabla numérica.
     * 
     * @param args Los argumentos de línea de comandos
     */
    public static void main(String[] args) {
        
        // Imprimimos la cabecera de la tabla utilizando tabuladores (\t) para alinear adecuadamente las columnas
        System.out.println("n\t10*n\t100*n\t1000*n");
        
        // Iniciamos un ciclo for que se repetirá desde n = 1 hasta n = 5, aumentando de uno en uno en cada iteración
        for (int n = 1; n <= 5; n++) {
            
            // Imprimimos el valor actual de n junto con sus respectivas multiplicaciones por 10, 100 y 1000 separadas por tabuladores
            System.out.println(n + "\t" + (n * 10) + "\t" + (n * 100) + "\t" + (n * 1000));
        }
    }
}  