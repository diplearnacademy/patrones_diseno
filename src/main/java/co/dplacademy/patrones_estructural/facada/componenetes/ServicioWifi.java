package co.dplacademy.patrones_estructural.facada.componenetes;

public class ServicioWifi  implements  ServiciosMovil{


    @Override
    public void iniciar() {
        System.out.println("Servicio wifi Iniciado");
    }

    @Override
    public void cerrar() {
        System.out.println("Servicio wifi apagado");
    }
}
