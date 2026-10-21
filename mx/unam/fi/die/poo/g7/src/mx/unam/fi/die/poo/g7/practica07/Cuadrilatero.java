package mx.unam.fi.die.poo.g7.practica07;

/**
 * Superclase de la jerarquia (relacion HAS-A): un cuadrilatero TIENE cuatro
 * vertices, cada uno representado por un objeto {@link Punto}.
 */
public class Cuadrilatero {
    private Punto vertice1;
    private Punto vertice2;
    private Punto vertice3;
    private Punto vertice4;

    /**
     * Crea un cuadrilatero a partir de sus cuatro vertices.
     *
     * @param v1 primer vertice
     * @param v2 segundo vertice
     * @param v3 tercer vertice
     * @param v4 cuarto vertice
     */
    public Cuadrilatero(Punto v1, Punto v2, Punto v3, Punto v4) {
        this.vertice1 = v1;
        this.vertice2 = v2;
        this.vertice3 = v3;
        this.vertice4 = v4;
    }

    /**
     * Obtiene el primer vertice.
     *
     * @return el vertice 1
     */
    public Punto getVertice1() {
        return vertice1;
    }

    /**
     * Obtiene el segundo vertice.
     *
     * @return el vertice 2
     */
    public Punto getVertice2() {
        return vertice2;
    }

    /**
     * Obtiene el tercer vertice.
     *
     * @return el vertice 3
     */
    public Punto getVertice3() {
        return vertice3;
    }

    /**
     * Obtiene el cuarto vertice.
     *
     * @return el vertice 4
     */
    public Punto getVertice4() {
        return vertice4;
    }

    /**
     * Sobrescribe {@link Object#toString()}. Usa el nombre real de la clase del
     * objeto, por lo que las clases hijas heredan este metodo y muestran su
     * propio nombre.
     *
     * @return el nombre de la clase y sus cuatro vertices
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " [" + vertice1 + ", " + vertice2
                + ", " + vertice3 + ", " + vertice4 + "]";
    }
}
