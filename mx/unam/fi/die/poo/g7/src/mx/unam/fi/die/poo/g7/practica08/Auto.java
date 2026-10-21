package mx.unam.fi.die.poo.g7.practica08;

/**
 * Representa un automovil de gasolina. Su huella de carbono depende
 * de los kilometros recorridos y de su rendimiento de combustible.
 * No esta relacionado por herencia con las demas clases.
 *
 * @author Equipo 5
 * @version 1.0
 */
public class Auto implements HuellaCarbono {

    /** Factor de emision de la gasolina (kg CO2 por litro).*/
    private static final double FACTOR_GASOLINA = 2.31;

    private String placa;
    private double kmRecorridos;
    private double kmPorLitro;

    /**
     * Crea un auto.
     *
     * @param placa        placa del auto
     * @param kmRecorridos kilometros recorridos
     * @param kmPorLitro   rendimiento del auto en kilometros por litro
     */
    public Auto(String placa, double kmRecorridos, double kmPorLitro) {
        this.placa = placa;
        this.kmRecorridos = kmRecorridos;
        this.kmPorLitro = kmPorLitro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public double getKmPorLitro() {
        return kmPorLitro;
    }

    public void setKmPorLitro(double kmPorLitro) {
        this.kmPorLitro = kmPorLitro;
    }

    /**
     * Calcula la huella de carbono del auto:
     * (kmRecorridos / kmPorLitro) * factor de gasolina.
     *
     * @return huella de carbono 
     */
    @Override
    public double getHuellaCarbono() {
        if (kmPorLitro <= 0) {
            return 0.0;
        }
        return (kmRecorridos / kmPorLitro) * FACTOR_GASOLINA;
    }

    @Override
    public String toString() {
        return "Auto [placa=" + placa + ", km=" + kmRecorridos + ", rendimiento="
                + kmPorLitro + " km/L]";
    }
}