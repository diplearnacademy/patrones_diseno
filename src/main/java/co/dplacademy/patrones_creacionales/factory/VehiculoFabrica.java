package co.dplacademy.patrones_creacionales.factory;

public class VehiculoFabrica {

    public Vehiculo obtenerVehiculo(String tipoVehiculo){

        if(tipoVehiculo == null){
            return  null;
        }
        if(tipoVehiculo.equalsIgnoreCase("Automovil")){
            return  new Automovil();
        } else if (tipoVehiculo.equalsIgnoreCase("camion")) {
            return  new Camion();
        } else if (tipoVehiculo.equalsIgnoreCase("motocicleta")) {
            return  new Motocicleta();
        }
           return  null;
    }
}
