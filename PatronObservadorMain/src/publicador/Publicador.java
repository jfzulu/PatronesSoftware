package publicador;

import suscriptor.Suscriptor;

public interface Publicador {
	public void agregarSuscriptor(Suscriptor suscriptor);
    public void removerSuscriptor(Suscriptor suscriptor);
    public void notificarSuscriptor();
    public void ejecutar();
}
