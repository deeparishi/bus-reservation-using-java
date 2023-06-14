package com.projectbus;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        System.out.println("Helloooo Bookers,");
        System.out.println("Welcome to Yatra Booking!!!!");

        ArrayList<buslist> buses = new ArrayList<buslist>();
        ArrayList<PassengerList> passengers = new ArrayList<PassengerList>();

        buses.add(new buslist(1, false, "Both", 2));
        buses.add(new buslist(2, true, "Both", 25));
        buses.add(new buslist(3, false, "Seater", 55));
        buses.add(new buslist(4, true, "sleeper", 20));

        for (buslist b : buses) {
            b.displayInfo();
        }


        int input = 1;
        Scanner sc = new Scanner(System.in);
        while (input == 1) {
            System.out.println();
            System.out.println();
            System.out.println("Click 1 for Booking and Click 2 for Exit");
            input = sc.nextInt();
            if (input == 1) {
                PassengerList a = new PassengerList();
                if (a.isAvailable(buses, passengers)) {
                    passengers.add(a);
                    System.out.println("Confirmed");
                } else {
                    System.out.println("Sorry bus is full");
                }
            } else {
                System.out.println("Booked list");
                for (PassengerList a : passengers) {
                    System.out.println(a.passengerName);
                    System.out.println(a.date);
                }
            }


        }
    }
}
