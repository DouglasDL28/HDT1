import java.util.ArrayList;

public class Radio implements iRadio{
    private boolean encendido;
    private double  estacion;
    private boolean isAM;
    private ArrayList<Double> estacionesFavAM;
    private ArrayList<Double> estacionesFavFM;

    public Radio () {
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
            } else {
                this.estacion = 1610;
            }
        } else { //87.9 a 107.9 de 0.2
            if (this.estacion > 89.7) {
                this.estacion -= 0.2;
            } else {
                this.estacion = 107.9;
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
            } else {
                this.estacion = 530;
            }
        } else { //87.9 a 107.9 de 0.2
            if (this.estacion < 107.9) {
                this.estacion += 0.2;
            } else {
                this.estacion = 87.9;
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

    public double getEstacion() {
        return estacion;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public void setEstacion(double estacion) {
        this.estacion = estacion;
    }

    public boolean isAM() {
        return isAM;
    }

    public void setAM(boolean AM) {
        isAM = AM;
    }

    public ArrayList<Double> getEstacionesFavAM() {
        return estacionesFavAM;
    }

    public void setEstacionesFavAM(ArrayList<Double> estacionesFavAM) {
        this.estacionesFavAM = estacionesFavAM;
    }

    public ArrayList<Double> getEstacionesFavFM() {
        return estacionesFavFM;
    }

    public void setEstacionesFavFM(ArrayList<Double> estacionesFavFM) {
        this.estacionesFavFM = estacionesFavFM;
    }
}
