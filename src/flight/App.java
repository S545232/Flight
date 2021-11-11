/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flight;

import java.util.Arrays;

/**
 *
 * @author Anil Kumar Kolla(S545232@nwmissouri.edu)
 */
public class App {

    public static void main(String[] args) {
        Flight flight = new Flight();

        int[] passengerIds = flight.takeUserInputs();
        System.out.println("Passengers Ids list is: " + Arrays.toString(passengerIds));

        String[] flightNumbers = flight.getFlightNumbers(passengerIds);

        System.out.println("Flight numbers list is: " + Arrays.toString(flightNumbers));

        flight.sortPassengersByFlight(flightNumbers);

        System.out.println("Sorted flight numbers of all the passengers is: " + Arrays.toString(flightNumbers));
    }
}
