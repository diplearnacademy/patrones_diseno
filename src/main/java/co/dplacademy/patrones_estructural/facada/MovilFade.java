package co.dplacademy.patrones_estructural.facada;

import co.dplacademy.patrones_estructural.facada.componenetes.*;

import java.util.Arrays;
import java.util.List;

public class MovilFade {


    public  Movil encenderMovil(){

        Bateria bateria = new Bateria();
        bateria.encender();

        Cpu cpu = new Cpu();
        cpu.lanzarSistemaArranque();

        ServiciosMovil gps =  new ServicioGPS();
        gps.iniciar();

        ServiciosMovil wifi = new ServicioWifi();
        wifi.iniciar();

        List<ServiciosMovil> serviciosMovils = Arrays.asList(gps,wifi);
        return new Movil(bateria,cpu,serviciosMovils);
    }

    public  void apagarMovil(Movil movile){
        for (ServiciosMovil servicio: movile.getServiciosMovils()) {
            servicio.cerrar();
        }
        movile.getCpu().apagarCpu();
        movile.getBateria().apagar();
    }


}
