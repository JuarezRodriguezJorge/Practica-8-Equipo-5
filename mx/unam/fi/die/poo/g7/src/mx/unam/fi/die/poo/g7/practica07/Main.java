package mx.unam.fi.die.poo.g7.practica07;

/**
 * Programa principal: crea una instancia de cada clase de la jerarquia con los
 * puntos de prueba, muestra el area de cada objeto (excepto la de Cuadrilatero)
 * y demuestra los conceptos de herencia vistos en la practica.
 */
public class Main {

    /**
     * Punto de entrada de la aplicacion.
     *
     * @param args argumentos de linea de comandos (no se utilizan)
     */
    public static void main(String[] args) {

        // ---------- Creacion de los objetos ----------
        Cuadrilatero cuadrilatero = new Cuadrilatero(
                new Punto(0, 0), new Punto(4, 0), new Punto(5, 3), new Punto(1, 2));
        Trapezoide trapezoide = new Trapezoide(
                new Punto(0, 0), new Punto(8, 0), new Punto(6, 4), new Punto(2, 4));
        Paralelogramo paralelogramo = new Paralelogramo(
                new Punto(0, 0), new Punto(6, 0), new Punto(8, 4), new Punto(2, 4));
        Rectangulo rectangulo = new Rectangulo(
                new Punto(0, 0), new Punto(6, 0), new Punto(6, 4), new Punto(0, 4));
        Cuadrado cuadrado = new Cuadrado(
                new Punto(0, 0), new Punto(5, 0), new Punto(5, 5), new Punto(0, 5));

        // ---------- 1. Areas (Cuadrilatero no muestra area) ----------
        System.out.println("===== 1. Areas =====");
        System.out.println("Area del Trapezoide:     " + trapezoide.calcularArea());
        System.out.println("Area del Paralelogramo:  " + paralelogramo.calcularArea());
        System.out.println("Area del Rectangulo:     " + rectangulo.obtenerArea());
        System.out.println("Area del Cuadrado:       " + cuadrado.calcularArea());

        // ---------- 2. Clase Object ----------
        System.out.println();
        System.out.println("===== 2. Clase Object: toString() y equals() =====");
        System.out.println(cuadrilatero);
        System.out.println(cuadrado);
        Punto a = new Punto();
        Punto b = new Punto(0, 0);
        System.out.println("a == b      : " + (a == b));
        System.out.println("a.equals(b) : " + a.equals(b));

        // ---------- 3. IS-A ----------
        System.out.println();
        System.out.println("===== 3. Relacion IS-A (herencia) =====");
        System.out.println("cuadrado es Rectangulo:    " + (cuadrado instanceof Rectangulo));
        System.out.println("cuadrado es Cuadrilatero:  " + (cuadrado instanceof Cuadrilatero));
        System.out.println("trapezoide es Cuadrado:    " + (trapezoide instanceof Cuadrado));

        // ---------- 4. HAS-A ----------
        System.out.println();
        System.out.println("===== 4. Relacion HAS-A (composicion) =====");
        System.out.println("Un Cuadrilatero TIENE 4 puntos. Vertice 1 = " + cuadrilatero.getVertice1());

        // ---------- 5. Sobrecarga ----------
        System.out.println();
        System.out.println("===== 5. Sobrecarga (overloading) =====");
        System.out.println("new Punto()                      = " + new Punto());
        System.out.println("trapezoide.calcularArea()        = " + trapezoide.calcularArea());
        System.out.println("trapezoide.calcularArea(8, 4, 4) = " + trapezoide.calcularArea(8, 4, 4));

        // ---------- 6. Sobrescritura y polimorfismo ----------
        System.out.println();
        System.out.println("===== 6. Sobrescritura (overriding) =====");
        Trapezoide figura = cuadrado; // un Cuadrado ES UN Trapezoide
        System.out.println("Trapezoide figura = cuadrado; figura.calcularArea() = "
                + figura.calcularArea());
    }
}
