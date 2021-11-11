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

    private static final String FLIGHT_1633 = "DL1633", FLIGHT_1655 = "DL1655", FLIGHT_1677 = "DL1677";

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

        System.out.println("Enter id's of the passengers, The id should be >=0  and <" + arraySize);
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

    public void sortPassengersByFlight(String[] array) {
        int start = 0;
        int end = array.length - 1;
        int index = 0;
        String temp = "";

        while (index <= end && start < end) {
            temp = array[index];
            if (array[index].equalsIgnoreCase(FLIGHT_1633)) {
                array[index] = array[start];
                array[start] = temp;
                start++;
                index++;

            } else if (array[index].equalsIgnoreCase(FLIGHT_1677)) {
                array[index] = array[end];
                array[end] = temp;
                end--;

            } else {
                index++;
            }
        }

    }

    public String[] getFlightNumbers(int[] passengerIds) {
        String[] flightNumbers = new String[passengerIds.length];

//        Passenger[] passengers = makePassengersList();
        Passenger[] passengers = makePassengersList1(passengerIds.length);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < passengerIds.length; i++) {
            for (int j = 0; j < passengers.length; j++) {
                if (passengerIds[i] == passengers[j].getPassengerId()) {
                    flightNumbers[i] = passengers[j].getFlightNumber();
                }
            }
        }

        return flightNumbers;
    }

    public Passenger[] makePassengersList1(int size) {
        Passenger[] passengersArray = new Passenger[size];

        for (int i = 0; i < size; i++) {
            passengersArray[i] = new Passenger(i, getFlightNumber(i), "Elon" + " " + i, "New York", "Hyderabad");
        }

        return passengersArray;
    }

    private String getFlightNumber(int passengerId) {
        String flightNumber;

        if (passengerId % 2 == 0) {
            flightNumber = FLIGHT_1633;

        } else if (passengerId > 3 && passengerId < 11) {
            flightNumber = FLIGHT_1655;

        } else {
            flightNumber = FLIGHT_1677;
        }

        return flightNumber;
    }

    private void tryAgain() {
        System.out.println("Invalid input entered. Please enter the passenger id between 1 to 10 only");
        takeUserInputs();
        return;
    }
}

//public Passenger[] makePassengersList() {
//        Passenger[] passengersArray = new Passenger[10];
//
//        Passenger p1 = new Passenger(1, "DL1655", "Elon1", "New York", "Hyderabad");
//        Passenger p2 = new Passenger(2, "DL1633", "Elon2", "New York", "Hyderabad");
//        Passenger p3 = new Passenger(3, "DL1677", "Elon3", "New York", "Hyderabad");
//        Passenger p4 = new Passenger(4, "DL1655", "Elon4", "New York", "Hyderabad");
//        Passenger p5 = new Passenger(5, "DL1677", "Elon5", "New York", "Hyderabad");
//        Passenger p6 = new Passenger(6, "DL1633", "Elon6", "New York", "Hyderabad");
//        Passenger p7 = new Passenger(7, "DL1655", "Elon7", "New York", "Hyderabad");
//        Passenger p8 = new Passenger(8, "DL1677", "Elon8", "New York", "Hyderabad");
//        Passenger p9 = new Passenger(9, "DL1655", "Elon9", "New York", "Hyderabad");
//        Passenger p10 = new Passenger(10, "DL1633", "Elon10", "New York", "Hyderabad");
//
//        passengersArray[0] = p1;
//        passengersArray[1] = p2;
//        passengersArray[2] = p3;
//        passengersArray[3] = p4;
//        passengersArray[4] = p5;
//        passengersArray[5] = p6;
//        passengersArray[6] = p7;
//        passengersArray[7] = p8;
//        passengersArray[8] = p9;
//        passengersArray[9] = p10;
//
//        return passengersArray;
//    }
