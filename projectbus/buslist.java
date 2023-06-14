package com.projectbus;

import java.util.ArrayList;
import java.util.Date;

public class buslist {

    private int busNo;
    private boolean AC;
    private String Seater;
    private int capacity;

    buslist(int numb, boolean type, String seatype, int capacity){
        this.busNo=numb;
        this.AC=type;
        this.Seater=seatype;
        this.capacity=capacity;
    }
    public int getBusNo(){
        return busNo;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int cap){
        capacity=cap;
    }

    public void displayInfo(){
        System.out.println();
        System.out.println();
        System.out.println("BUS NO: " + busNo);
        if(AC){
            System.out.println("TYPE: AC");
        }else{
            System.out.println("TYPE: NON-AC");
        }
        System.out.println("SEAT TYPE: " + Seater);
        System.out.println("CAPACITY: " + capacity);
    }


}