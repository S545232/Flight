/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flight;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Anil Kumar Kolla(S545232@nwmissouri.edu)
 */
public class Flight {

    public int[] takeUserInputs() {
        int arraySize = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of passengers: ");

        try {
            arraySize = sc.nextInt();
        } catch (Exception e) {
            tryAgain();
        }

        int[] passengerIds = new int[arraySize];

        System.out.println("Enter id's of the passengers, The id should be >= 0 and < " + arraySize);
        System.out.println("Enter id of the passenger:");
        for (int i = 0; i < arraySize; i++) {

            int userInput = sc.nextInt();

            if (userInput >= 0 && userInput < arraySize) {
                passengerIds[i] = userInput;

            } else {
                tryAgain();
            }

            if (i != arraySize - 1) {
                System.out.println("Enter id of the next passenger:");
            }
        }

        sc.close();

        return passengerIds;
    }

    public Passenger[] makePassengersList(int size) {
        Passenger[] passengersArray = new Passenger[size];

        for (int i = 0; i < size; i++) {
            passengersArray[i] = new Passenger(i, getFlightNumber(i), "Elon " + i, "New York", "Hyderabad");
        }

        return passengersArray;
    }

    private String getFlightNumber(int passengerId) {
        String flightNumber;

        if (passengerId % 2 == 0) {
            flightNumber = FlightNumber.FLIGHT_1633.getFlightNumber();

        } else if (passengerId / 2 == 1) {
            flightNumber = FlightNumber.FLIGHT_1655.getFlightNumber();

        } else {
            flightNumber = FlightNumber.FLIGHT_1677.getFlightNumber();
        }

        return flightNumber;
    }

    public String[] getFlightNumbers(int[] passengerIds) {
        String[] flightNumbers = new String[passengerIds.length];

        Passenger[] passengers = makePassengersList(passengerIds.length);

        for (int i = 0; i < passengerIds.length; i++) {
            for (int j = 0; j < passengers.length; j++) {
                if (passengerIds[i] == passengers[j].getPassengerId()) {
                    flightNumbers[i] = passengers[j].getFlightNumber();
                }
            }
        }

        return flightNumbers;
    }

    public void sortPassengersByFlightNumber(String[] array) {
        int start = 0;
        int end = array.length - 1;
        int index = 0;
        String temp = "";

        while (index <= end) {
            temp = array[index];
            if (array[index].equalsIgnoreCase(FlightNumber.FLIGHT_1633.getFlightNumber())) {
                array[index] = array[start];
                array[start] = temp;
                start++;
                index++;

            } else if (array[index].equalsIgnoreCase(FlightNumber.FLIGHT_1677.getFlightNumber())) {
                array[index] = array[end];
                array[end] = temp;
                end--;

            } else {
                index++;
            }
        }

    }

    private void tryAgain() {
        System.out.println("Invalid input entered. Please enter the passenger id between 1 to 10 only");
        takeUserInputs();
        return;
    }
}
