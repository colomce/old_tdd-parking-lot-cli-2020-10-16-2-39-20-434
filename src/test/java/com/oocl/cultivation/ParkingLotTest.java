package com.oocl.cultivation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ParkingLotTest {
    @Test
    void should_return_ParkingTicket_when_park_given_ParkingLot_and_Car() {
        //given
        ParkingLot parkingLot = new ParkingLot(10);
        Car car = new Car();

        //when
        ParkingTicket parkingTicket = parkingLot.park(car);

        //then
        assertNotNull(parkingTicket);
    }

    @Test
    void should_return_10_when_getCapacity_given_ParkingLot_capacity_10() {
        //given
        ParkingLot parkingLot = new ParkingLot(10);
        //when
        int capacity = parkingLot.getCapacity();

        //then
        assertEquals(10, capacity);
    }
}
