package co.dplacademy.patrones_estructural.facada;



public class ClienteFacade {

    public static void main(String[] args) {
        MovilFade movilFade = new MovilFade();
        Movil movil = movilFade.encenderMovil();

        System.out.println("________________________________--------------------------------");

        movilFade.apagarMovil(movil);

    }


}
