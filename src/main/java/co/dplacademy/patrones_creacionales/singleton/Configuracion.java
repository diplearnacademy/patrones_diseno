package co.dplacademy.patrones_creacionales.singleton;

public class Configuracion {

    private static  Configuracion instanciaunica;
    private String valor;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    /*public  Configuracion(String valor){
        this.valor = valor;

    }*/

    private  Configuracion(){
    }


    public  static  Configuracion getInstance(){
        if (instanciaunica == null){
            instanciaunica = new Configuracion();
        }
        return  instanciaunica;
    }

}
