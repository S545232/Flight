/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flight;

/**
 * FlightNumber Enum Class
 * @author Anil Kumar Kolla(S545232@nwmissouri.edu)
 */
public enum FlightNumber {

    /**
     * Constants for FlightNumber Enum
     */
    FLIGHT_1633("DL1633"),

    FLIGHT_1655("DL1655"),

    FLIGHT_1677("DL1677");

    /**
     * Attribute of FlightNumber Enum
     */
    private final String flightNumber;

    /**
     * Parameterized Constructor for FlightNumber Enum
     * @param flightNumber 
     */
    private FlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    /**
     * Getter Method to get flightNumber
     * @return flightNumber
     */
    public String getFlightNumber() {
        return flightNumber;
    }

}
