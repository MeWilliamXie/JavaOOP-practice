package com.afs.oopractice;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Car", new ElectricEngine());
        Truck truck = new Truck("Truck", 80);
        Driver carDriver = new Driver(car);
        Driver truckDriver = new Driver(truck);
        carDriver.showMessage();
        truckDriver.showMessage();
    }
}
