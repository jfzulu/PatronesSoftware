/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronmediador;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.List;

public class ControlTower implements FlightControlMediator {
    
    private List<Flight> registeredFlights = new ArrayList<>();

    @Override
    public void registerFlight(Flight flight) {
        registeredFlights.add(flight);
    }

    @Override
    public void requestLanding(Flight flight) {
        System.out.println("Flight " + flight.flightNumber + " requests landing permission.");
        if (isClearForLanding(flight)) {
            flight.grantLandingPermission();
        } else {
            System.out.println("Flight " + flight.flightNumber + " is waiting for landing permission.");
        }
    }

    private boolean isClearForLanding(Flight flight) {
        // Simulamos una lógica de control de tráfico aéreo simple
        return registeredFlights.indexOf(flight) == 0;
    }
}