package co.dplacademy.patrones_creacionales.builder;

public class CasaBuilder implements  Builder{


    private  String area;
    private  String tipoParedes;
    private  String tipoPiso;
    private  int  numeroVetanas;
    private  int  numeraPuertas;
    private  boolean tieneParqueadero;
    private  boolean tienePiscina;
    private  boolean tieneJardin;

    public CasaBuilder(String area){
        this.area = area;
    }

    public CasaBuilder conTipoParedes(String tipoParedes){
        this.tipoParedes = tipoParedes;
        return  this;
    }

    public CasaBuilder conTipoPiso(String tipoPiso){
        this.tipoPiso = tipoPiso;
        return this;
    }

    public  CasaBuilder conNumeroVetanas(int numeroVetanas){
        this.numeroVetanas = numeroVetanas;
        return this;
    }

    public  CasaBuilder conParquedero(boolean tieneParqueadero){
        this.tieneParqueadero = tieneParqueadero;
        return this;
    }

    public  CasaBuilder conPiscina(boolean tienePiscina){
        this.tienePiscina = tienePiscina;
        return this;
    }

    public  CasaBuilder conJardin(boolean tieneJardin){
        this.tieneJardin = tieneJardin;
        return this;
    }

    @Override
    public Casa build() {
        Casa casa  = new Casa();
        casa.setArea(this.area);
        casa.setTipoParedes(this.tipoParedes);
        casa.setTipoPiso(this.tipoPiso);
        casa.setNumeroVetanas(this.numeroVetanas);
        casa.setNumeraPuertas(this.numeraPuertas);
        casa.setTieneParqueadero(this.tieneParqueadero);
        casa.setTienePiscina(this.tienePiscina);
        casa.setTieneJardin(this.tieneJardin);
        return casa;
    }
}
