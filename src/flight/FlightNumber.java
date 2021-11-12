/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flight;

/**
 *
 * @author Anil Kumar Kolla(S545232@nwmissouri.edu)
 */
public enum FlightNumber {

    FLIGHT_1633("DL1633"),
    FLIGHT_1655("DL1655"),
    FLIGHT_1677("DL1677");

    private String flightNumber;

    private FlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

}
