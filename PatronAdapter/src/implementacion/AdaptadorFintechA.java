/*
 * Asignatura: Patrones de Diseño de Software 
 * Patrón Estructural - > Adapter
 * Tipo de Clase: Java
 */

package implementacion;
import fintech.a.FintechACreditos;
import fintech.a.FintechARecepcionCredito;
import fintech.a.FintechAResultadoAprobacion;
import fintech.a.IntFintechARecepcionCredito;


/**
 *
 * @author Fabrizio Bolaño
 */
public class AdaptadorFintechA implements InterfaceFintechAdaptador, IntFintechARecepcionCredito {
    private FintechAResultadoAprobacion FAresponse;
    
    @Override
    public FintechCreditoRespuesta EnvioSolicitudCredito(FintechSolicitudCredito request) {
        FintechACreditos FArequest = new FintechACreditos();
        FArequest.setCredito((float) request.getValor());
        FArequest.setNombre(request.getCliente());

        FintechARecepcionCredito sender = new FintechARecepcionCredito();
        sender.sendCreditForValidate(FArequest, this);

        do {
            try {
                Thread.sleep(10000);
                System.out.println("Fintech_A solicitud en espera....");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (FAresponse == null);

        FintechCreditoRespuesta response = new FintechCreditoRespuesta();
        response.setAprobacion(FAresponse.getAprobado() == "Y" ? true : false);
        return response;
    }

    @Override
    public void NotificacionResultado(FintechAResultadoAprobacion resultado) {
        this.FAresponse = resultado;
    }
    
}