package co.dplacademy.patrones_comportamentales.estrategy.implementacionConcreta;

import co.dplacademy.patrones_comportamentales.estrategy.EstrategiaComisiones;

public class ComisionNormal  implements EstrategiaComisiones {
    @Override
    public double aplicarComisiones(double cantida) {
        return cantida * 0.30;
    }
}
