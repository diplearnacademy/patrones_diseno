package co.dplacademy.patrones_estructural.facada.componenetes;

public class ServicioGPS implements  ServiciosMovil{
    @Override
    public void iniciar() {
        System.out.println("servicio gps iniciado");
    }

    @Override
    public void cerrar() {
        System.out.println("servicio gps apagado");
    }
}
