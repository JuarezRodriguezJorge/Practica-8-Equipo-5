package mx.unam.fi.die.poo.g7.practica07;

/**
 * Representa un punto en el plano cartesiano mediante sus coordenadas (x, y).
 * Muestra la sobrecarga de constructores y la sobrescritura de metodos de
 * {@link Object} (toString, equals y hashCode).
 */
public class Punto {
    private double x;
    private double y;

    /**
     * Constructor sobrecargado sin parametros: crea el punto en el origen (0, 0).
     */
    public Punto() {
        this(0, 0);
    }

    /**
     * Constructor sobrecargado con parametros: crea un punto con las
     * coordenadas indicadas.
     *
     * @param x coordenada en el eje X
     * @param y coordenada en el eje Y
     */
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Obtiene la coordenada X del punto.
     *
     * @return la coordenada X
     */
    public double getX() {
        return x;
    }

    /**
     * Obtiene la coordenada Y del punto.
     *
     * @return la coordenada Y
     */
    public double getY() {
        return y;
    }

    /**
     * Sobrescribe {@link Object#toString()} para mostrar el punto como (x, y).
     *
     * @return la representacion en texto del punto
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    /**
     * Sobrescribe {@link Object#equals(Object)}: dos puntos son iguales si
     * tienen las mismas coordenadas.
     *
     * @param obj objeto con el que se compara
     * @return true si el objeto es un Punto con las mismas coordenadas
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Punto)) {
            return false;
        }
        Punto otro = (Punto) obj;
        return Double.compare(x, otro.x) == 0 && Double.compare(y, otro.y) == 0;
    }

    /**
     * Sobrescribe {@link Object#hashCode()} de forma coherente con equals.
     *
     * @return el codigo hash del punto
     */
    @Override
    public int hashCode() {
        return 31 * Double.hashCode(x) + Double.hashCode(y);
    }
}
