package com.afs.oopractice;

public class Vehicle {
    private String name;
    private int maxSpeed;


    public Vehicle(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void speedUp(){
        System.out.println(String.format("%s: speed up to max speed - %d km/h",this.name,this.maxSpeed));
    }
}
