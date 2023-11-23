/*
 * Asignatura: Patrones de Diseño de Software 
 * Patrón Estructural - > Proxy
 * Tipo de Clase: Main()
 */

package patronproxy;
import implementacion.InterfaceProcesos;
import implementacion.FabricaServicios;
import java.util.Scanner;
/**
 *
 * @author Fabrizio Bolaño
 */
public class PatronProxyMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        InterfaceProcesos ProcesoActivo = FabricaServicios.CrearEjecucionProceso();
        int opc;
        do{
            String usuario = "fbolano";
            String password = "pds";
            int proceso = 1;
            try {
                ProcesoActivo.EjecutarProcesos(proceso, usuario, password);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Ingrese 1(continuar)/0(cancelar)");
            opc = scan.nextInt();
        }while(opc == 1);
    }
    
}
