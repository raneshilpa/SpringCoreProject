package co.spring.learning.springdemo;

import lombok.Data;

//@Data
public class Car {
    private  String make;
    private String model;
    private  Engine engine;

    public Car(String make, String model, Engine engine) {
        this.make = make;
        this.model = model;
        this.engine = engine;
    }
}
