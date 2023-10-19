package patronobservador;
import publicador.SemaforoPublicador;
import suscriptor.CarroSuscriptor;
import suscriptor.SemaforoPeatonal;

public class PatronObservadorMain {
	public static void main(String[] args) {
		SemaforoPublicador semaforo = new SemaforoPublicador();
		CarroSuscriptor carro = new CarroSuscriptor();
                SemaforoPeatonal peaton = new SemaforoPeatonal();
                semaforo.agregarSuscriptor(peaton);
		semaforo.agregarSuscriptor(carro);
		semaforo.ejecutar();
	}
}
