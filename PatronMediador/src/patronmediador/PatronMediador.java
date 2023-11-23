/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronmediador;

/**
 *
 * @author User
 */
public class PatronMediador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FlightControlMediator controlTower = new ControlTower();

        Flight flight1 = new Flight("AA123", controlTower);
        Flight flight2 = new Flight("BA456", controlTower);

        flight1.requestLanding();
        flight2.requestLanding();
    }
    
}
