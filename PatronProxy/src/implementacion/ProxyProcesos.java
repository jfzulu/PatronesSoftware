/*
 * Asignatura: Patrones de Diseño de Software 
 * Patrón Estructural - > Proxy
 * Tipo de Clase: Java
 */
package implementacion;
import java.util.Date;
import servicios.Auditoria;
import servicios.Seguridad;

/**
 *
 * @author Fabrizio Bolaño
 */
public class ProxyProcesos implements InterfaceProcesos {
    private int ejecucionesContador = 0;
    private Date fechaUltimaEjecucion;
    
    @Override
    public void EjecutarProcesos(int IdProceso, String Usuario, String Password) throws Exception {
         Seguridad securityService = new Seguridad();
        if(!securityService.Autorizacion(Usuario, Password)){
            throw new Exception("El usuario '"+Usuario
                    +"' no tiene privilegios para ejecutar el proceso");
        }
        
        ejecucionesContador++;
        verificarLimiteEjecuciones();
        
        ProcesoDefecto ejecutorProcess = new ProcesoDefecto();
        ejecutorProcess.EjecutarProcesos(IdProceso, Usuario, Password);
        
        Auditoria audit = new Auditoria();
        audit.AuditoriaServicioUsado(Usuario, ProcesoDefecto.class.getName());
    }
    
    private void verificarLimiteEjecuciones() throws Exception {
        if(ejecucionesContador>3 && esMismoDia()){
            throw new Exception("El proceso no puede ejecutarse más de tres veces en un mismo dia");
        }
    }
    
    private boolean esMismoDia() {
        Date fechaActual = new Date();
        if (fechaUltimaEjecucion == null) {
            fechaUltimaEjecucion = fechaActual;
            return true;
        }
        // Compara solo el día, ignorando la hora, minutos y segundos
        return fechaActual.getYear() == fechaUltimaEjecucion.getYear() &&
               fechaActual.getMonth() == fechaUltimaEjecucion.getMonth() &&
               fechaActual.getDay() == fechaUltimaEjecucion.getDay();
    }
    
}