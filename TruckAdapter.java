package org.example;

public class TruckAdapter implements Car {
    private final Truck truck;

    public TruckAdapter(Truck truck) {
        this.truck = truck;
    }

    @Override
    public void drive() {
        truck.haul();
    }
}