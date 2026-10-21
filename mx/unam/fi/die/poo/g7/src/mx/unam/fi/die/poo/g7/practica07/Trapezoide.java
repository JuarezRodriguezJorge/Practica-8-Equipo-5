package mx.unam.fi.die.poo.g7.practica07;

/**
 * Cuadrilatero con dos bases paralelas (horizontales: P1-P2 abajo y P4-P3 arriba).
 * Relacion IS-A: un Trapezoide ES UN {@link Cuadrilatero}.
 */
public class Trapezoide extends Cuadrilatero {

    /**
     * Crea un trapezoide a partir de sus cuatro vertices. El constructor de la
     * clase hija invoca al de la superclase con super(...).
     *
     * @param punto1 primer vertice
     * @param punto2 segundo vertice
     * @param punto3 tercer vertice
     * @param punto4 cuarto vertice
     */
    public Trapezoide(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        super(punto1, punto2, punto3, punto4);
    }

    /**
     * Calcula el area a partir de los vertices con la formula general del
     * trapecio. Las clases hijas pueden sobrescribir este metodo.
     *
     * @return el area del trapezoide
     */
    public double calcularArea() {
        double baseMayor = Math.abs(getVertice2().getX() - getVertice1().getX());
        double baseMenor = Math.abs(getVertice3().getX() - getVertice4().getX());
        double altura    = Math.abs(getVertice4().getY() - getVertice1().getY());
        return calcularArea(baseMayor, baseMenor, altura);
    }

    /**
     * Sobrecarga de calcularArea(): mismo nombre pero con parametros distintos.
     * Calcula A = (B + b) * h / 2 con los valores recibidos.
     *
     * @param baseMayor longitud de la base mayor (B)
     * @param baseMenor longitud de la base menor (b)
     * @param altura altura (h)
     * @return el area del trapecio
     */
    public double calcularArea(double baseMayor, double baseMenor, double altura) {
        return (baseMayor + baseMenor) * altura / 2;
    }
}
