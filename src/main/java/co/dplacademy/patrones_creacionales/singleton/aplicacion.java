package co.dplacademy.patrones_creacionales.singleton;

public class aplicacion {

    public static void main(String[] args) {

        //Configuracion configuracion = new Configuracion("valor");
        // Configuracion configuracion2 = new Configuracion("valor2");
        //Configuracion configuracion2 = new Configuracion();

        Configuracion configuracion = Configuracion.getInstance();
        configuracion.setValor("valor inicial");
        System.out.println("valor primer instancia " + configuracion.getValor());

        Configuracion config = Configuracion.getInstance();
        System.out.println("valor segunda instancia " + configuracion.getValor());
        config.setValor("nuevo valor");


    }

}
