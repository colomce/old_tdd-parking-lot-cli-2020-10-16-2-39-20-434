package com.oocl.cultivation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    void should_return_new_Car_when_new_Car_given_Car() {
        //given
        Car car = new Car();
        //when

        //then
        Assertions.assertEquals(car.getClass(), Car.class);
    }
}
