/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronmediador;

/**
 *
 * @author User
 */
public class Flight {
    String flightNumber;
    private FlightControlMediator mediator;

    public Flight(String flightNumber, FlightControlMediator mediator) {
        this.flightNumber = flightNumber;
        this.mediator = mediator;
        mediator.registerFlight(this);
    }

    public void requestLanding() {
        mediator.requestLanding(this);
    }

    public void grantLandingPermission() {
        System.out.println("Flight " + flightNumber + " has been granted landing permission.");
    }
    
}