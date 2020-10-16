package com.oocl.cultivation;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private Map<ParkingTicket, Car> parkingSpace = new HashMap<>();

    public ParkingLot() {
    }

    public ParkingLot(int capacity) {

    }

    public ParkingTicket park(Car car) {
        ParkingTicket parkingTicket = new ParkingTicket();
        parkingSpace.put(parkingTicket, car);
        return parkingTicket;
    }

    Car fetch(ParkingTicket parkingTicket) {
        Car car = parkingSpace.get(parkingTicket);
        parkingSpace.remove(parkingTicket);
        return car;
    }

    boolean isTicketValid(ParkingTicket parkingTicket) {
        return parkingSpace.get(parkingTicket) != null;
    }

    public int getCapacity() {
        return 0;
    }
}
