package org.example;

public class AdapterDemo {
    public static void main(String[] args) {
        System.out.println("\nAdapter Pattern Example");

        Car sedan = new Sedan();
        sedan.drive();

        Truck truck = new Truck();
        Car truckAsCar = new TruckAdapter(truck);
        truckAsCar.drive();
    }
}