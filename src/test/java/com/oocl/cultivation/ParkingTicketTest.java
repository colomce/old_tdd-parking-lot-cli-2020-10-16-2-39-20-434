package com.oocl.cultivation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingTicketTest {

    @Test
    void should_return_ParkingTicket_when_new_ParkingTicket_given_ParkingTicket() {
        //given
        ParkingTicket parkingTicket = new ParkingTicket();

        //when

        //then
        assertEquals(parkingTicket.getClass(), ParkingTicket.class);
    }
}
