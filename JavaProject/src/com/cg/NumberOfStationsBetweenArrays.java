package com.cg;

import java.util.Arrays;

public class NumberOfStationsBetweenArrays {

    public static int findStationsBetween(int[] arrival, int[] departure) {
        Arrays.sort(arrival);
        Arrays.sort(departure);

        int numStations = 0;
        int i = 0;
        int j = 0;

        int currentStations = 0;

        while (i < arrival.length && j < departure.length) {
            if (arrival[i] < departure[j]) {
                currentStations++;
                i++;
            } else {
                currentStations--;
                j++;
            }

            // Update the maximum number of stations seen so far
           
            numStations = Math.max(numStations, currentStations);
          
        }

        return numStations;
    }

    public static void main(String[] args) {
        int[] arrival = { 2, 4, 7, 10 };
        int[] departure = { 5, 8, 11, 15 };

        int numStations = findStationsBetween(arrival, departure);
        System.out.println("Number of stations between arrays: " + numStations);
    }
}
