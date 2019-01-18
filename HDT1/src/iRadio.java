/**
 * Interfaz para el manejo de las caracteristicas basicas de una radio.
 *
 * @author Pablo Sao
 * @version 1.1
 * @date 14/01/2019
 */
public interface iRadio
{
    /**
     * Metodo para cambiar de frecuencia seleccionada en la radio.
     *
     * @return retorna la frecuencia seleccionada
     */
    boolean cambiarAmFm();

    /**
     * Metodo para manejar el encendido y apagado de la radio
     *
     */
    void encendidoRadio();

    /**
     * Metodo para subir la frecuencia que se encuentra actualmente en la radio.
     *
     * @return Nueva frecuencia a reproducir en la radio.
     */
    double subirFrecuencia();

    /**
     * Metodo para bajar la frecuencia que se encuentra actualmente en la radio.
     *
     */
    double bajarFrecuencia();

    /**
     * Metodo para almacenar la frecuencia en el boton seleccionado
     */
    void setFavorito(int posicion);

    /**
     * Metodo para obtener la frecuencia almacenada en el boton, segun la emisora.
     *
     */
    double getFavorito(int posicion);


}