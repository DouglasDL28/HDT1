import java.util.ArrayList;

public class Radio implements iRadio{
    private boolean encendido;
    private double  estacion;
    private boolean isAM;
    private ArrayList<Double> estacionesFavAM;
    private ArrayList<Double> estacionesFavFM;

    public Radio (boolean encendido, int volumen, double estacion, String banda) {
        this.encendido = false;
        this.estacion = 100.0;
        this.isAM = true;
        this.estacionesFavAM = new ArrayList<>();
        this.estacionesFavFM = new ArrayList<>();
    }

    @Override
    public boolean cambiarAmFm() {
        if (isAM) {
            this.estacion = 89.7;
            return this.isAM = false;
        } else {
            this.estacion = 530;
            return this.isAM = true;
        }
    }

    @Override
    public double bajarFrecuencia() {
        if (this.isAM) {//530 a 1610 de 10
            if (this.estacion > 530) {
                this.estacion -= 10;
            }
        } else { //87.9 a 107.9 de 0.2
            if (this.estacion > 89.7) {
                this.estacion -= 0.2;
            }
        }
        return this.estacion;
    }

    @Override
    public double getFavorito(int posicion) {
        if (this.isAM){
            return this.estacionesFavAM.get(posicion);
        } else {
            return this.estacionesFavFM.get(posicion);
        }
    }

    @Override
    public double subirFrecuencia() {
        if (this.isAM) {//530 a 1610 de 10
            if (this.estacion < 1610) {
                this.estacion += 10;
            }
        } else { //87.9 a 107.9 de 0.2
            if (this.estacion < 107.9) {
                this.estacion += 0.2;
            }
        }
        return this.estacion;
    }

    @Override
    public void encendidoRadio() {
        if (encendido){
            this.encendido = false;
        } else {
            this.encendido = true;
        }
    }

    @Override
    public void setFavorito(int posicion) {
        double estacion = this.estacion;
        if (this.isAM) {
            this.estacionesFavAM.add(posicion, estacion);
        } else {
            this.estacionesFavFM.add(posicion, estacion);
        }
    }
}
