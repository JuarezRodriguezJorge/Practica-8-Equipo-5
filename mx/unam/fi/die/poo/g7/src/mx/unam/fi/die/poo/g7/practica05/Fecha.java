package mx.unam.fi.die.poo.g7.practica05;

/**
 * Clase que representa una fecha con mes, día y año, permitiendo su almacenamiento,
 * modificación y visualización en formato estándar.
 * @author brigada 5
 * @version 1.0
 */
public class Fecha {
    private int mes;
    private int dia;
    private int año; 

    /**
     * Constructor que inicializa los valores de la fecha (mes, día y año).
     * @param mes El mes de la fecha.
     * @param dia El día de la fecha.
     * @param año El año de la fecha.
     */
    public Fecha(int mes, int dia, int año) {
        this.mes = mes;
        this.dia = dia;
        this.año = año;
    }

    /**
     * Obtiene el mes de la fecha.
     * @return El valor del mes.
     */
    public int getMes() {
        return mes;
    }

    /**
     * Establece o modifica el mes de la fecha.
     * @param mes El nuevo mes a asignar.
     */
    public void setMes(int mes) {
        this.mes = mes;
    }

    /**
     * Obtiene el día de la fecha.
     * @return El valor del día.
     */
    public int getDia() {
        return dia;
    }

    /**
     * Establece o modifica el día de la fecha.
     * @param dia El nuevo día a asignar.
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * Obtiene el año de la fecha.
     * @return El valor del año.
     */
    public int getAño() { 
        return año;
    }

    /**
     * Establece o modifica el año de la fecha.
     * @param año El nuevo año a asignar.
     */
    public void setAño(int año) { 
        this.año = año;
    }

    /**
     * Imprime en la consola la fecha en formato numérico (mes/día/año).
     */
    public void mostrarFecha() {
        System.out.println(getMes() + "/" + getDia() + "/" + getAño());
    }
}