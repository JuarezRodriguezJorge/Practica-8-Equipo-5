package mx.unam.fi.die.poo.g7.practica08;

/**
 * Representa una bicicleta. Una bicicleta comun no emite CO2 al usarse, pero.
 * una electrica emite una cantidad pequena por la electricidad que consume.
 * No esta relacionada por herencia con las demas clases.
 *
 * @author Equipo 5
 * @version 1.0
 */
public class Bicicleta implements HuellaCarbono {

    /** Emision de una bicicleta electrica (kg CO2 por km). */
    private static final double FACTOR_ELECTRICA = 0.007;

    private String tipo;
    private double kmRecorridos;
    private boolean esElectrica;

    /**
     * Crea una bicicleta.
     *
     * @param tipo         tipo de bicicleta (urbana, de montana, etc.)
     * @param kmRecorridos kilometros recorridos
     * @param esElectrica  true si la bicicleta es electrica
     */
    public Bicicleta(String tipo, double kmRecorridos, boolean esElectrica) {
        this.tipo = tipo;
        this.kmRecorridos = kmRecorridos;
        this.esElectrica = esElectrica;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public boolean isEsElectrica() {
        return esElectrica;
    }

    public void setEsElectrica(boolean esElectrica) {
        this.esElectrica = esElectrica;
    }

    /**
     * Calcula la huella de carbono de la bicicleta. Es cero si no es electrica;
     * si es electrica, kmRecorridos * factor de bicicleta electrica.
     *
     * @return huella de carbono en kg de CO2
     */
    @Override
    public double getHuellaCarbono() {
        if (!esElectrica) {
            return 0.0;
        }
        return kmRecorridos * FACTOR_ELECTRICA;
    }

    @Override
    public String toString() {
        return "Bicicleta [tipo=" + tipo + ", km=" + kmRecorridos + ", electrica="
                + esElectrica + "]";
    }
}