package com.oocl.cultivation;

public class ParkingBoy {
    private ParkingLot parkingLot;

    public ParkingBoy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ParkingTicket park(Car car) {
        return new ParkingTicket();
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public Car fetch(ParkingTicket parkingTicket) {
        return null;
    }
}
