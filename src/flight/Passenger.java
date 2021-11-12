/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flight;

/**
 * Passenger Class which holds details of Passengers. 
 * @author Anil Kumar Kolla(S545232@nwmissouri.edu)
 */
public class Passenger {
    private int passengerId;
    private String flightNumber;
    private String name;
    private String fromLoaction;
    private String toLoaction;

    /**
     * Parameterized Constructor for Passenger Class
     * @param passengerId
     * @param flightNumber
     * @param name
     * @param fromLoaction
     * @param toLoaction
     */
    public Passenger(int passengerId, String flightNumber, String name, String fromLoaction, String toLoaction) {
        this.passengerId = passengerId;
        this.flightNumber = flightNumber;
        this.name = name;
        this.fromLoaction = fromLoaction;
        this.toLoaction = toLoaction;
    }

    /**
     * Getter Method to get passengerId of the Passenger
     * @return passengerId
     */
    public int getPassengerId() {
        return passengerId;
    }

    /**
     * Getter Method to get flightNumber of the Passenger
     * @return flightNumber
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Getter Method to get name of the Passenger
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter Method to get fromLoaction of the Passenger
     * @return fromLoaction
     */
    public String getFromLoaction() {
        return fromLoaction;
    }

    /**
     * Getter Method to get toLoaction of the Passenger
     * @return toLoaction
     */
    public String getToLoaction() {
        return toLoaction;
    }

    /**
     * toString method to return Passenger details
     * @return String
     */
    @Override
    public String toString() {
        return "Passenger{" + "passengerId=" + passengerId + ", flightNumber=" + flightNumber + ", name=" + name + ", fromLoaction=" + fromLoaction + ", toLoaction=" + toLoaction + '}';
    }
}
