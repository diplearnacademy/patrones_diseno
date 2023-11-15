package co.dplacademy.patrones_comportamentales.estrategy.implementacionConcreta;

import co.dplacademy.patrones_comportamentales.estrategy.EstrategiaComisiones;

public class Contexto {


    private EstrategiaComisiones estrategiaComisiones;

    public Contexto(EstrategiaComisiones estrategiaComisiones){
        this.estrategiaComisiones = estrategiaComisiones;
    }

    public double ejecutarEstrategia(double cantidad){
        return  estrategiaComisiones.aplicarComisiones(cantidad);
    }
}
