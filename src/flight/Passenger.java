/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flight;

/**
 *
 * @author Anil Kumar Kolla(S545232@nwmissouri.edu)
 */
public class Passenger {
    private int passengerId;
    private String flightNumber;
    private String name;
    private String fromLoaction;
    private String toLoaction;

    public Passenger(int passengerId, String flightNumber, String name, String fromLoaction, String toLoaction) {
        this.passengerId = passengerId;
        this.flightNumber = flightNumber;
        this.name = name;
        this.fromLoaction = fromLoaction;
        this.toLoaction = toLoaction;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getName() {
        return name;
    }

    public String getFromLoaction() {
        return fromLoaction;
    }

    public String getToLoaction() {
        return toLoaction;
    }
}
