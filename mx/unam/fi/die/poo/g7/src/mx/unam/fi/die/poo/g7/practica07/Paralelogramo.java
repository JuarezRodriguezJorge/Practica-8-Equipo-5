package mx.unam.fi.die.poo.g7.practica07;

/**
 * Trapezoide cuyas dos bases miden lo mismo (B = b).
 * Relacion IS-A: un Paralelogramo ES UN {@link Trapezoide}.
 */
public class Paralelogramo extends Trapezoide {

    /**
     * Crea un paralelogramo a partir de sus cuatro vertices.
     *
     * @param punto1 primer vertice
     * @param punto2 segundo vertice
     * @param punto3 tercer vertice
     * @param punto4 cuarto vertice
     */
    public Paralelogramo(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        super(punto1, punto2, punto3, punto4);
    }

    /**
     * Sobrescritura de calcularArea() de {@link Trapezoide}: misma firma, pero
     * con la formula del caso B = b, A = base * altura.
     *
     * @return el area del paralelogramo
     */
    @Override
    public double calcularArea() {
        double base   = Math.abs(getVertice2().getX() - getVertice1().getX());
        double altura = Math.abs(getVertice4().getY() - getVertice1().getY());
        return base * altura;
    }
}
