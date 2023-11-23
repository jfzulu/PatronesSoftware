/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_fidelizacion;

/**
 *
 * @author User
 */
public class SistemaFidelizacion {
    public int calcularPuntos(double montoCompra) {
        // Cada 100 pesos otorgan 10 puntos
        return (int) (montoCompra / 100) * 10;
    }
}
