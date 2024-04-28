package domain;

import java.util.List;

public class ListaDeViajes {

    private List<ListaDeViajes> viajes;
    private TipoDeViajeConParadas tipoDeViaje;

    public void modificarDemoraDeViajes() {
        viajes.forEach( unViaje -> tipoDeViaje.modificarDemora(unViaje));
    }
}
