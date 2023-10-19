
package suscriptor;

import patronobservador.EstadoSemaforo;

public class SemaforoPeatonal implements Suscriptor {

	EstadoSemaforo estadoAnterior;

	public SemaforoPeatonal () {
		estadoAnterior = EstadoSemaforo.ROJO;
	}
	@Override
	public void actualizar(EstadoSemaforo estadoSemaforo) {
		
		switch (estadoSemaforo) {
			case ROJO:
				System.out.println("Peatonal puede cruzar");
				break;
			case VERDE:
				System.out.println("Peaton debe esperar");
				break;
			}
		estadoAnterior = estadoSemaforo;		
	}
}
