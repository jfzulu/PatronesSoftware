/*
 * Asignatura: Patrones de Diseño de Software 
 * Patrón Estructural - > Adapter
 * Tipo de Clase: Interface
 */
package implementacion;

/**
 *
 * @author Fabrizio Bolaño
 */
public interface InterfaceFintechAdaptador {
    public FintechCreditoRespuesta EnvioSolicitudCredito(FintechSolicitudCredito request);
    
}