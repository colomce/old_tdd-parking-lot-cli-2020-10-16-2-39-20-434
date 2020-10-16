package com.oocl.cultivation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParkingLotTest {

    @Test
    void should_return_ParkingLot_when_new_ParkingLot_given_a_ParkingLot() {
        //given
        ParkingLot parkingLot = new ParkingLot();

        //when

        //then
        Assertions.assertEquals(parkingLot.getClass(), ParkingLot.class);
    }
}
