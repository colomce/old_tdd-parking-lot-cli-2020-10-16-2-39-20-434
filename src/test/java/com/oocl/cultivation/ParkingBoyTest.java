package com.oocl.cultivation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

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

    @Test
    void should_return_right_Car_when_ParkingBoy_fetch_a_car_given_ParkingTicket() {
        //given
        Car car = new Car();
        ParkingBoy parkingBoy = new ParkingBoy(new ParkingLot());
        ParkingTicket parkingTicket = parkingBoy.park(car);

        //when
        Car fetchedCar = parkingBoy.fetch(parkingTicket);

        //then
        assertSame(car, fetchedCar);
    }

    @Test
    void should_return_Cars_when_ParkingBoy_fetch_given_two_tickets_from_two_parked_cars() {
        //given
        Car firstCar = new Car();
        Car secondCar = new Car();
        ParkingBoy parkingBoy = new ParkingBoy(new ParkingLot());
        ParkingTicket firstParkingTicket = parkingBoy.park(firstCar);
        ParkingTicket secondParkingTicket = parkingBoy.park(secondCar);

        //when
        Car fetchedFirstCar = parkingBoy.fetch(firstParkingTicket);
        Car fetchedSecondCar = parkingBoy.fetch(secondParkingTicket);

        //then
        assertSame(firstCar, fetchedFirstCar);
        assertSame(secondCar, fetchedSecondCar);
    }

    @Test
    void should_return_no_Car_when_fetch_car_given_wrong_ticket() {
        //given
        ParkingBoy parkingBoy = new ParkingBoy(new ParkingLot());
        Car car = new Car();
        ParkingTicket correctParkingTicket = parkingBoy.park(car);
        ParkingTicket wrongTicket = new ParkingTicket();

        //when
        Car fetchedCar = parkingBoy.fetch(wrongTicket);
        boolean isValidTicket = parkingBoy.isTicketValid(wrongTicket);

        //then
        assertNull(fetchedCar);
        assertFalse(isValidTicket);
    }

    @Test
    void should_return_no_Car_when_fetch_given_no_ticket() {
        //given
        ParkingBoy parkingBoy = new ParkingBoy(new ParkingLot());

        //when
        Car fetchedCar = parkingBoy.fetch(null);

        //then
        assertNull(fetchedCar);
    }
}
