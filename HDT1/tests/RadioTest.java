import org.junit.Test;

import static org.junit.Assert.*;

public class RadioTest {

    @Test
    public void cambiarAmFm() {
        Radio Myradio = new Radio();
        Myradio.encendidoRadio();
        Myradio.cambiarAmFm();
        assertTrue(Myradio.cambiarAmFm());
    }

    @Test
    public void bajarFrecuencia() {
        Radio Myradio = new Radio();
        Myradio.encendidoRadio();
        assertEquals(1610.0, Myradio.bajarFrecuencia(),0.02);

    }

    @Test
    public void getFavorito() {
        Radio Myradio = new Radio();
        Myradio.encendidoRadio();
        //assertEquals();
    }

    @Test
    public void subirFrecuencia() {
        Radio Myradio = new Radio();
        Myradio.encendidoRadio();
        assertEquals(110.0, Myradio.subirFrecuencia(),0.02);
    }

    @Test
    public void encendidoRadio() {
        Radio Myradio = new Radio();
        // para ver si el radio empieza apagado//
        assertFalse(Myradio.isEncendido());
        // para ver si el radio se enciende//
        Myradio.encendidoRadio();
        assertTrue(Myradio.isEncendido());
    }

    @Test
    public void setFavorito() {
        Radio Myradio = new Radio();
        Myradio.encendidoRadio();
        //assertEquals();
    }
}