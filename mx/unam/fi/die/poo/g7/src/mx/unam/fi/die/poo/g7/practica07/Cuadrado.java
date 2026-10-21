package mx.unam.fi.die.poo.g7.practica07;

/**
 * Rectangulo cuya base es igual a su altura (b = h).
 * Relacion IS-A: un Cuadrado ES UN {@link Rectangulo}.
 */
public class Cuadrado extends Rectangulo {

    /**
     * Crea un cuadrado a partir de sus cuatro vertices.
     *
     * @param punto1 primer vertice
     * @param punto2 segundo vertice
     * @param punto3 tercer vertice
     * @param punto4 cuarto vertice
     */
    public Cuadrado(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        super(punto1, punto2, punto3, punto4);
    }

    /**
     * Sobrescritura de calcularArea() de {@link Paralelogramo}: el area es
     * lado * lado, donde el lado es la distancia entre los vertices 1 y 2.
     *
     * @return el area del cuadrado
     */
    @Override
    public double calcularArea() {
        double dx = getVertice2().getX() - getVertice1().getX();
        double dy = getVertice2().getY() - getVertice1().getY();
        double lado = Math.sqrt(dx * dx + dy * dy);
        return lado * lado;
    }
}
