package com.projectbus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class PassengerList {
    String passengerName;
    int busNo;
    String sex;
    String seatType;
    Date date;

    PassengerList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        passengerName = sc.next();
        System.out.println("Enter the bus No: ");
        busNo = sc.nextInt();
        System.out.println("Gender: ");
        sex = sc.next();
        System.out.println("Seater or Sleeper");
        seatType = sc.next();
        System.out.println("Enter a date of journey: ");
        String dateInp = sc.next();
        SimpleDateFormat dateform = new SimpleDateFormat("dd-mm-yyyy");
        try {
            date = dateform.parse(dateInp);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public boolean isAvailable(ArrayList<buslist> buses, ArrayList<PassengerList> passengers) {
        int capacity = 0;
        for (buslist b : buses) {
            if (b.getBusNo() == busNo) {
                capacity = b.getCapacity();
            }
        }

            int booked = 0;
            for (PassengerList p : passengers) {
                if (p.busNo == busNo && p.date.equals(date)) {
                    booked++;
                }
            }


        return booked < capacity? true:false;
    }


}
