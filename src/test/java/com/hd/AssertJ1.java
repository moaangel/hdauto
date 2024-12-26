package com.hd;

import com.hd.car.Car;
import com.hd.car.CarStatus;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;


@Slf4j
@DisplayName("AssertJ Test")
public class AssertJ1 {
    Car car1;
    Car car2;

    @BeforeEach
    public void beforeEachTest(){
        car1 = Car.builder().name("Car1").size(1).status(CarStatus.GO).build();
        car2 = Car.builder().name("Car2").size(1).status(CarStatus.GO).build();
    }
    @Test
    @DisplayName("AssertJ Test 1")
    public void test1(){
        assertThat(car1.getName()).isEqualTo("ss");
        assertThat(car1).isNotNull();
        assertThat(car1).isEqualTo(car2);
    }

    @Test
    @DisplayName("AssertJ Test 2")
    public void test2(){
        List<Integer> lists = Arrays.asList(1,2,3,4,5);
        assertThat(lists).hasSize(5);
        assertThat(lists).contains(1,2,3);
        assertThat(lists).as("%d 리스트 사이즈",lists.size())
                .containsOnly(1,2,3,4);

    }

    @Test
    @DisplayName("AssertJ Test 3")
    public void test3(){
        SoftAssertions.assertSoftly((softly -> {
            softly.assertThat(car1.getName()).isNotEqualTo("Car1");
            softly.assertThat(car2.getName()).isNotEqualTo("Car2");
            softly.assertThat(car1.getStatus()).isEqualTo(CarStatus.STOP);
        }));
    }
}
