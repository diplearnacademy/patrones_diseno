package co.dplacademy.patrones_creacionales.factory;

public class Camion  implements  Vehiculo{
    @Override
    public void mostrarTipo() {
        System.out.println("soy un Camion!!!!!");
    }
}
