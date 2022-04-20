package co.spring.learning.springdemo.annotation;

import co.spring.learning.springdemo.Car;
import co.spring.learning.springdemo.ElectricEngine;
import co.spring.learning.springdemo.PetrolEngine;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class AppConfig
{
    @Value("{car.make}")
    private String make;
    @Value("{car.model}")
    private String model;
    @Bean()
    public ElectricEngine ElectricEngine()
    {
        return new ElectricEngine();
    }
    @Bean
    public PetrolEngine PetrolEngine()
    {
        return new PetrolEngine();

    }
    @Bean
    public Car car()
    {
        return new Car(make,model,PetrolEngine());

    }



}
