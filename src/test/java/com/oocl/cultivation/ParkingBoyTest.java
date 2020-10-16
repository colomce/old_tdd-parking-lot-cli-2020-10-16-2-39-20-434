package com.oocl.cultivation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ParkingBoyTest {

    @Test
    void should_return_ParkingBoy_when_constructor_given_ParkingLot() {
        //given
        ParkingBoy parkingBoy = new ParkingBoy(new ParkingLot());
        //when

        //then
        assertEquals(parkingBoy.getParkingLot().getClass(), ParkingLot.class);
    }

    @Test
    void should_return_ParkingTicket_when_ParkingBoy_park_Car_given_ParkingBoy_and_a_Car() {
        //given
        ParkingBoy parkingBoy = new ParkingBoy(new ParkingLot());
        Car car = new Car();

        //when
        ParkingTicket parkingTicket = parkingBoy.park(car);

        //then
        assertNotNull(parkingTicket);
    }
}
