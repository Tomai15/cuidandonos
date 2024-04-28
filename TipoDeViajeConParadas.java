package domain;

public interface  TipoDeViajeConParadas {
    public void modificarDemora(Viaje unViaje);
}

public class avisandoEstadoDeSalud implements TipoDeViajeConParadas {

    public void modificarDemora(Viaje unViaje){
        return;
    }

}

public class detencionPorMinutos implements TipoDeViajeConParadas {

    private Integer tiempoDetenerseEnParadas;
    public void modificarDemora(Viaje unViaje){
        unViaje.setDemoraEnMinutos(unViaje.getDemoraEnMinutos() + tiempoDetenerseEnParadas );
    }

}