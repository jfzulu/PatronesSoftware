
package suscriptor;

import patronobservador.EstadoSemaforo;

public class CarroSuscriptor implements Suscriptor {

	EstadoSemaforo estadoAnterior;

	public CarroSuscriptor () {
		estadoAnterior = EstadoSemaforo.ROJO;
	}
	@Override
	public void actualizar(EstadoSemaforo estadoSemaforo) {
		
		switch (estadoSemaforo) {
			case ROJO:
				System.out.println("Parar el carro");
				break;
			case AMARILLO:
				if(estadoAnterior.equals(EstadoSemaforo.ROJO))
					System.out.println("Listo para acelerar el carro");
				else
					System.out.println("Disminuir la velocidad del carro");
				break;
			case VERDE:
				System.out.println("Acelerar el carro");
				break;
			}
		estadoAnterior = estadoSemaforo;		
	}
}
