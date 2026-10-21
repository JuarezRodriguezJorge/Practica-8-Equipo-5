package mx.unam.fi.die.poo.g7.practica08;

import java.util.ArrayList;

/**
 * Esta es la clase principal. Crea un objeto de cada clase, guarda las referencias
 * en un ArrayList de la interfaz HuellaCarbono y los recorre invocando
 * polimorficamente el metodo getHuellaCarbono().
 *
 * @author Equipo 5
 * @version 1.0
 */
public class Main {

    /**
     * Punto de entrada del programa.
     *
     * @param args argumentos de linea de comandos (no se usan)
     */
    public static void main(String[] args) {
        ArrayList<HuellaCarbono> lista = new ArrayList<HuellaCarbono>();

        lista.add(new Edificio("Av. Universidad 3000", 1200.0, 8500.0, 300.0));
        lista.add(new Auto("ABC-123", 15000.0, 12.0));
        lista.add(new Bicicleta("Urbana", 3000.0, false));

        double total = 0.0;

        System.out.println("Huella de carbono por objeto");
        for (HuellaCarbono objeto : lista) {
            double huella = objeto.getHuellaCarbono();   // polimorfismo
            System.out.println(objeto);                  // toString de cada clase
            System.out.println("  Huella de carbono: " + String.format("%.2f", huella) + " kg CO2");
            System.out.println();
            total += huella;
        }

        System.out.println("Huella total: " + String.format("%.2f", total) + " kg CO2");
    }
}