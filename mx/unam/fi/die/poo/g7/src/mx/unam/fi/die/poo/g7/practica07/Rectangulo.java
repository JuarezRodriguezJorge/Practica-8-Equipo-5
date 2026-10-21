package mx.unam.fi.die.poo.g7.practica07;

/**
 * Paralelogramo con angulos rectos.
 * Relacion IS-A: un Rectangulo ES UN {@link Paralelogramo}.
 */
public class Rectangulo extends Paralelogramo {

    /**
     * Crea un rectangulo a partir de sus cuatro vertices.
     *
     * @param punto1 primer vertice
     * @param punto2 segundo vertice
     * @param punto3 tercer vertice
     * @param punto4 cuarto vertice
     */
    public Rectangulo(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        super(punto1, punto2, punto3, punto4);
    }

    /**
     * Obtiene el area del rectangulo (base * altura), reutilizando el calculo
     * heredado de {@link Paralelogramo}.
     *
     * @return el area del rectangulo
     */
    public double obtenerArea() {
        return calcularArea();
    }
}
