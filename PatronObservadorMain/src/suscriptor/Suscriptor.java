package suscriptor;

import patronobservador.EstadoSemaforo;

public interface Suscriptor {
    void actualizar(EstadoSemaforo contexto);
}