package mx.unam.fi.die.poo.g7.practica08;

/**
 * Representa un edificio, su huella de carbono depende del consumo
 * de electricidad y del gas utilizado para la calefaccion.
 * No esta relacionado por herencia con las demas clases.
 *
 * @author Equipo 5
 * @version 1.0
 */
public class Edificio implements HuellaCarbono {

    /** Factor de emision de la electricidad (kg CO2 por kWh). */
    private static final double FACTOR_ELECTRICIDAD = 0.438;

    /** Factor de emision del gas natural (kg CO2 por metro cubico). */
    private static final double FACTOR_GAS = 2.0;

    private String direccion;
    private double area;
    private double consumoKwh;
    private double consumoGas;

    /**
     * Crea un edificio con calefaccion.
     *
     * @param direccion  direccion del edificio
     * @param area       area construida en metros cuadrados
     * @param consumoKwh consumo de electricidad en kWh
     * @param consumoGas consumo de gas para calefaccion en metros cubicos
     */
    public Edificio(String direccion, double area, double consumoKwh, double consumoGas) {
        this.direccion = direccion;
        this.area = area;
        this.consumoKwh = consumoKwh;
        this.consumoGas = consumoGas;
    }

    /**
     * Crea un edificio sin calefaccion osea su consumo de gas es igual a cero.
     *
     * @param direccion  direccion del edificio
     * @param area       area construida en metros cuadrados
     * @param consumoKwh consumo de electricidad en kWh
     */
    public Edificio(String direccion, double area, double consumoKwh) {
        this(direccion, area, consumoKwh, 0.0);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getConsumoKwh() {
        return consumoKwh;
    }

    public void setConsumoKwh(double consumoKwh) {
        this.consumoKwh = consumoKwh;
    }

    public double getConsumoGas() {
        return consumoGas;
    }

    public void setConsumoGas(double consumoGas) {
        this.consumoGas = consumoGas;
    }

    /**
     * Calcula la huella de carbono del edificio
     * (consumoKwh * factor de electricidad) + (consumoGas * factor de gas).
     *
     * @return huella de carbono 
     */
    @Override
    public double getHuellaCarbono() {
        return (consumoKwh * FACTOR_ELECTRICIDAD) + (consumoGas * FACTOR_GAS);
    }

    @Override
    public String toString() {
        return "Edificio [direccion=" + direccion + ", area=" + area + " m2, consumo="
                + consumoKwh + " kWh, gas=" + consumoGas + " m3]";
    }
}