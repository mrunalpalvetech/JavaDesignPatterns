package com.creational;

public class Builder {
    public static void main(String[] args) {
        Car car1 = new Car.CarBuilder("Tesla","White")
                .withEngine("1200CC")
                .withGear("XXX")
                .build();
        System.out.println(car1);
    }
}
