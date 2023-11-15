package co.dplacademy.patrones_creacionales.builder;

public class Casa {

    private  String area;

    private  String tipoParedes;
    private  String tipoPiso;
    private  int  numeroVetanas;
    private  int  numeraPuertas;
    private  boolean tieneParqueadero;
    private  boolean tienePiscina;
    private  boolean tieneJardin;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTipoParedes() {
        return tipoParedes;
    }

    public void setTipoParedes(String tipoParedes) {
        this.tipoParedes = tipoParedes;
    }

    public String getTipoPiso() {
        return tipoPiso;
    }

    public void setTipoPiso(String tipoPiso) {
        this.tipoPiso = tipoPiso;
    }

    public int getNumeroVetanas() {
        return numeroVetanas;
    }

    public void setNumeroVetanas(int numeroVetanas) {
        this.numeroVetanas = numeroVetanas;
    }

    public int getNumeraPuertas() {
        return numeraPuertas;
    }

    public void setNumeraPuertas(int numeraPuertas) {
        this.numeraPuertas = numeraPuertas;
    }

    public boolean isTieneParqueadero() {
        return tieneParqueadero;
    }

    public void setTieneParqueadero(boolean tieneParqueadero) {
        this.tieneParqueadero = tieneParqueadero;
    }

    public boolean isTienePiscina() {
        return tienePiscina;
    }

    public void setTienePiscina(boolean tienePiscina) {
        this.tienePiscina = tienePiscina;
    }

    public boolean isTieneJardin() {
        return tieneJardin;
    }

    public void setTieneJardin(boolean tieneJardin) {
        this.tieneJardin = tieneJardin;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "area='" + area + '\'' +
                ", tipoParedes='" + tipoParedes + '\'' +
                ", tipoPiso='" + tipoPiso + '\'' +
                ", numeroVetanas=" + numeroVetanas +
                ", numeraPuertas=" + numeraPuertas +
                ", tieneParqueadero=" + tieneParqueadero +
                ", tienePiscina=" + tienePiscina +
                ", tieneJardin=" + tieneJardin +
                '}';
    }
}
