/*
 * Asignatura: Patrones de Diseño de Software 
 * Patrón Estructural - > Facade
 * Tipo de Clase: Java
 */

package facturador;

/**
 *
 * @author Fabrizio Bolaño
 */
public class SolicitudPagoFactura {
    private Long clienteId;
    private double pago;
    
    public SolicitudPagoFactura(Long clienteId, double pago) {
        this.clienteId = clienteId;
        this.pago = pago;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }
    
    
}