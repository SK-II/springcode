package com.spring.code.day8.bean;

import org.springframework.beans.factory.annotation.Value;

//@Service
public class CarService {

    @Value("宾利")
    public String carName;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
