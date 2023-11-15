package co.dplacademy.patrones_comportamentales.estrategy;

import co.dplacademy.patrones_comportamentales.estrategy.implementacionConcreta.ComisionCompleta;
import co.dplacademy.patrones_comportamentales.estrategy.implementacionConcreta.ComisionNormal;
import co.dplacademy.patrones_comportamentales.estrategy.implementacionConcreta.ComisionRegular;
import co.dplacademy.patrones_comportamentales.estrategy.implementacionConcreta.Contexto;

public class EjemploEstrategia {

    private static  EstrategiaComisiones obtenerEstrategia(double cantidad){
        EstrategiaComisiones estrategia;
        if(cantidad >= 1000){
            estrategia = new ComisionCompleta();
        } else if (cantidad >= 500 && cantidad <= 999) {
            estrategia = new ComisionNormal();
        } else{
            estrategia = new ComisionRegular();
        }
        return  estrategia;
    }




    public static void main(String[] args) {

        EstrategiaComisiones estrategiaComisiones = obtenerEstrategia(1000);
        Contexto contexto = new Contexto(estrategiaComisiones);
        System.out.println("comision por 1000 " + contexto.ejecutarEstrategia(1000));


       estrategiaComisiones = obtenerEstrategia(500);
        contexto = new Contexto(estrategiaComisiones);
        System.out.println("comision por 500 " + contexto.ejecutarEstrategia(500));

        estrategiaComisiones = obtenerEstrategia(100);
        contexto = new Contexto(estrategiaComisiones);
        System.out.println("comision por 100 " + contexto.ejecutarEstrategia(100));

    }
}
