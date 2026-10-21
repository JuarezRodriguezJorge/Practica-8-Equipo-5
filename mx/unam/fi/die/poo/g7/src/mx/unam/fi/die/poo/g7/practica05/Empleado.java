package mx.unam.fi.die.poo.g7.practica05;

/**
 * Clase que representa a un empleado con nombre, apellido y salario mensual,
 * permitiendo calcular su salario anual y validar que el salario sea positivo.
 * @author brigada 5
 * @version 1.0
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private double salarioMensual;

    /**
     * Constructor que inicializa los datos del empleado validando el salario mensual.
     * @param nombre El nombre del empleado.
     * @param apellido El apellido del empleado.
     * @param salarioMensual El salario mensual inicial del empleado.
     */
    public Empleado(String nombre, String apellido, double salarioMensual) {
        this.nombre = nombre;
        this.apellido = apellido;

        if (salarioMensual > 0.0) {
            this.salarioMensual = salarioMensual;
        }
    }

    /**
     * Obtiene el nombre del empleado.
     * @return El nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece o modifica el nombre del empleado.
     * @param nombre El nuevo nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido del empleado.
     * @return El apellido del empleado.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece o modifica el apellido del empleado.
     * @param apellido El nuevo apellido del empleado.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene el salario mensual del empleado.
     * @return El salario mensual.
     */
    public double getSalarioMensual() {
        return salarioMensual;
    }

    /**
     * Establece o modifica el salario mensual validando que sea mayor a cero.
     * @param salarioMensual El nuevo salario mensual.
     */
    public void setSalarioMensual(double salarioMensual) {
        if (salarioMensual > 0.0) {
            this.salarioMensual = salarioMensual;
        }
    }

    /**
     * Calcula y obtiene el salario anual del empleado multiplicando su salario mensual por doce.
     * @return El salario anual total.
     */
    public double getSalarioAnual() {
        return getSalarioMensual() * 12;
    }
}