/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package patronmediador;

/**
 *
 * @author User
 */
public interface FlightControlMediator {
    void registerFlight(Flight flight);
    void requestLanding(Flight flight);
}
