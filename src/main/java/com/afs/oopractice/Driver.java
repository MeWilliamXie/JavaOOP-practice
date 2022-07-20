package com.afs.oopractice;

public class Driver {
    private Vehicle vehicle;

    public Driver(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public void showMessage(){
        vehicle.speedUp();
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

}
