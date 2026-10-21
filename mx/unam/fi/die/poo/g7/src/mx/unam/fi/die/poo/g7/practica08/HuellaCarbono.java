package mx.unam.fi.die.poo.g7.practica08;

/**
 * Esta es la interfaz que define el contrato para cualquier objeto que genere
 * una huella de carbono.
 *
 * @author Equipo 5
 * @version 1.0
 */
public interface HuellaCarbono {

    /**
     * Calcula la huella de carbono del objeto.
     *
     * @return huella de carbono expresada en kg de CO2
     */
    double getHuellaCarbono();
}
