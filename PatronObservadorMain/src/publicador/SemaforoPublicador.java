package publicador;
import java.util.ArrayList;
import java.util.List;

import patronobservador.EstadoSemaforo;
import suscriptor.Suscriptor;


public class SemaforoPublicador implements Publicador {
	private List<Suscriptor> suscriptores = new ArrayList<>();
	private EstadoSemaforo estadoSemaforo;
	
	public SemaforoPublicador() {
		estadoSemaforo = EstadoSemaforo.ROJO;
	}
	@Override
	public void ejecutar() {
		try {
			run();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void run() throws InterruptedException {
		long startTime = System.currentTimeMillis();
		long currentTime = startTime;

		while (currentTime - startTime < 30000) {
			cambiarEstado();
			Thread.sleep(2000);
			currentTime = System.currentTimeMillis();
		}	
	}

	private void cambiarEstado() {
		switch (estadoSemaforo) {
		case ROJO:
			estadoSemaforo = EstadoSemaforo.VERDE;
			break;
		case AMARILLO:
			estadoSemaforo = EstadoSemaforo.ROJO;
			break;
		case VERDE:
			estadoSemaforo = EstadoSemaforo.AMARILLO;
			break;
		}
		System.out.println("Semáforo Cambiando a " + estadoSemaforo);
		notificarSuscriptor();
	} 
	
	@Override
	public void agregarSuscriptor(Suscriptor suscriptor) {
		suscriptores.add(suscriptor);
	}

	@Override
	public void removerSuscriptor(Suscriptor suscriptor) {
		suscriptores.remove(suscriptor);
	}

	@Override
	public void notificarSuscriptor() {
		for (Suscriptor suscriptor : suscriptores) 
			suscriptor.actualizar(estadoSemaforo);
	}
}
