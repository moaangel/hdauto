package com.hd.car;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Car {
    private String name;
    private int size;
    private CarStatus status;

}