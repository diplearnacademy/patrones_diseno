package co.dplacademy.patrones_creacionales.builder;

public class BuilderMain {

    public static void main(String[] args) {

        CasaBuilder casaBuilder = new CasaBuilder("90m2");

        Casa casaprincipal = casaBuilder.conTipoParedes("ladrillo").conTipoPiso("ceramica").conPiscina(true)
                .conParquedero(true).build();

       // Casa casaCampo = casaBuilder.

        System.out.println(casaprincipal.toString());
    }
}
