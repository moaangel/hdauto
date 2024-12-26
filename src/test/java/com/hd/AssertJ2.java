package com.hd;

import com.hd.car.Car;
import com.hd.car.CarStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertJ2 {
    Car car1;
    Car car2;

    @BeforeEach
    public void beforeEachTest(){
        car1 = Car.builder().name(null).size(1).status(CarStatus.GO).build();
        car2 = Car.builder().name("Car2").size(1).status(CarStatus.GO).build();
    }

    @Test
    @DisplayName("AssertJ2 Test 1")
    public void test1(){
        assertThat(car1)
                .usingRecursiveComparison()
                .ignoringActualNullFields()
                .isEqualTo(car2);
    }
}
