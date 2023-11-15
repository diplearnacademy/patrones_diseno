package co.dplacademy.patrones_comportamentales.estrategy.implementacionConcreta;

import co.dplacademy.patrones_comportamentales.estrategy.EstrategiaComisiones;

public class ComisionRegular implements EstrategiaComisiones {
    @Override
    public double aplicarComisiones(double cantidad) {
        return cantidad * 0.10;
    }
}
