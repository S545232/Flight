/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flight;

import java.util.Arrays;

/**
 * App Class with main method
 * @author Anil Kumar Kolla(S545232@nwmissouri.edu)
 */
public class App {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        Flight flight = new Flight();
        
        int[] passengerIds = flight.takeUserInputs();
        
        System.out.println("IDs of the Passengers are: " + Arrays.toString(passengerIds));

        String[] flightNumbers = flight.getFlightNumbers(passengerIds);

        System.out.println("Flight Numbers respective to the above IDs of the Passengers: " + Arrays.toString(flightNumbers));

        flight.sortPassengersByFlightNumber(flightNumbers);

        System.out.println("Sorted flight numbers of all the passengers is: " + Arrays.toString(flightNumbers));
    }
}
