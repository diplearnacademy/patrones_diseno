package co.dplacademy.patrones_estructural.facada;

import co.dplacademy.patrones_estructural.facada.componenetes.Bateria;
import co.dplacademy.patrones_estructural.facada.componenetes.Cpu;
import co.dplacademy.patrones_estructural.facada.componenetes.ServiciosMovil;

import java.util.List;

public class Movil {

    private final Bateria bateria;

    private  final Cpu cpu;

    private  final List<ServiciosMovil> serviciosMovils;

    public Movil(Bateria bateria, Cpu cpu, List<ServiciosMovil> serviciosMovils) {
        this.bateria = bateria;
        this.cpu = cpu;
        this.serviciosMovils = serviciosMovils;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public List<ServiciosMovil> getServiciosMovils() {
        return serviciosMovils;
    }
}
