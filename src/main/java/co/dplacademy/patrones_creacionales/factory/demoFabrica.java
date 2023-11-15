package co.dplacademy.patrones_creacionales.factory;

public class demoFabrica {

    public static void main(String[] args) {

        VehiculoFabrica fabrica = new VehiculoFabrica();


        Vehiculo vehiculo1 = fabrica.obtenerVehiculo("Automovil");
        vehiculo1.mostrarTipo();

        Vehiculo vehiculo2 = fabrica.obtenerVehiculo("Camion");
        vehiculo2.mostrarTipo();

        Vehiculo vehiculo3 = fabrica.obtenerVehiculo("Motocicleta");
        vehiculo3.mostrarTipo();

    }






}
