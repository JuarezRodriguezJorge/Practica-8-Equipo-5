package mx.unam.fi.die.poo.g7.practica04;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * Esta clase se encarga de analizar una oración para contar palabras, 
 * calcular frecuencias, identificar palabras distintas y detectar duplicadas, 
 * ofreciendo métodos para mostrarlas ordenadas alfabéticamente.
 * 
 * @author brigada 5
 * @version 1.0
 */
public class AnalizadorPalabras {

    // Atributos: oración original y frecuencia de cada palabra.
    private String oracion;
    private Map<String, Integer> frecuencias;

    /**
     * Constructor de la clase AnalizadorPalabras.
     * Recibe la oración a procesar e inicializa el mapa de frecuencias vacío.
     * 
     * @param nuevaOracion La cadena de texto u oración que será analizada
     */
    public AnalizadorPalabras(String nuevaOracion) {
        this.oracion = nuevaOracion;
        this.frecuencias = new HashMap<>();
    }

    /**
     * Cuenta todas las palabras válidas de la oración y almacena sus frecuencias en el mapa.
     * Convierte el texto a minúsculas, elimina signos de puntuación y separa las palabras por espacios.
     * 
     * @return El número total de palabras encontradas en la oración
     */
    public int contarPalabras() {
        // Pasa todo a minúsculas y quita signos de puntuación comunes.
        String limpia = oracion.toLowerCase().replaceAll("[^a-záéíóúñ\\s]", "");
        limpia = limpia.trim();

        if (limpia.isEmpty()) {
            return 0;
        }

        String[] palabras = limpia.split("\\s+");
        for (String palabra : palabras) {
            if (frecuencias.containsKey(palabra)) {
                int contador = frecuencias.get(palabra);
                frecuencias.put(palabra, contador + 1);
            } else {
                frecuencias.put(palabra, 1);
            }
        }

        return palabras.length;
    }

    /**
     * Devuelve cuántas palabras diferentes (únicas) se encontraron en la oración.
     * 
     * @return El número de palabras distintas
     */
    public int obtenerNumeroPalabrasDistintas() {
        return frecuencias.size();
    }

    /**
     * Cuenta cuántas palabras diferentes tienen una frecuencia superior a uno (están duplicadas).
     * 
     * @return El número de palabras duplicadas
     */
    public int obtenerNumeroDuplicadas() {
        int duplicadas = 0;
        for (int conteo : frecuencias.values()) {
            if (conteo > 1) {
                duplicadas++;
            }
        }
        return duplicadas;
    }

    /**
     * Muestra en la consola todas las palabras analizadas y su respectiva frecuencia de aparición.
     */
    public void mostrarResultado() {
        System.out.println("\nFrecuencia de todas las palabras:");
        for (String palabra : frecuencias.keySet()) {
            System.out.println(palabra + ": " + frecuencias.get(palabra));
        }
    }

    /**
     * Muestra las palabras duplicadas encontradas en el mapa sin ningún orden particular.
     */
    public void mostrarDuplicadasSinOrdenar() {
        boolean hayDuplicadas = false;
        for (String palabra : frecuencias.keySet()) {
            if (frecuencias.get(palabra) > 1) {
                System.out.println(palabra + ": " + frecuencias.get(palabra));
                hayDuplicadas = true;
            }
        }
        if (!hayDuplicadas) {
            System.out.println("No hay palabras duplicadas.");
        }
    }

    /**
     * Muestra las palabras duplicadas ordenadas en orden alfabético utilizando un TreeSet.
     */
    public void mostrarDuplicadasOrdenadas() {
        TreeSet<String> ordenadas = new TreeSet<>(frecuencias.keySet());

        boolean hayDuplicadas = false;
        for (String palabra : ordenadas) {
            if (frecuencias.get(palabra) > 1) {
                System.out.println(palabra + ": " + frecuencias.get(palabra));
                hayDuplicadas = true;
            }
        }
        if (!hayDuplicadas) {
            System.out.println("No hay palabras duplicadas.");
        }
    }
} 