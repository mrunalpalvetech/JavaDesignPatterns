package com.creational;

public class Car {
    //Required fields
    private String model;
    private String color;

    //optional fields
    private String engine;
    private String gear;
    private String wheel;
    private String gearType;

    //private constructor to prevent actual initialization
    private Car(CarBuilder builder) {
        this.model = builder.model;
        this.color = builder.color;
        this.engine = builder.engine;
        this.gear = builder.gear;
        this.wheel = builder.wheel;
        this.gearType = builder.gearType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", gear='" + gear + '\'' +
                ", wheel='" + wheel + '\'' +
                ", gearType='" + gearType + '\'' +
                '}';
    }

    //Create static inner class
    public static class CarBuilder {
        //Required fields
        private String model;
        private String color;

        //optional fields
        private String engine;
        private String gear;
        private String wheel;
        private String gearType;

        //Constructor for required fields
        public CarBuilder(String model, String color) {
            this.model = model;
            this.color = color;
        }

        //Setter for optional params
        public CarBuilder withEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public CarBuilder withGear(String gear) {
            this.gear = gear;
            return this;
        }
        public CarBuilder withWheel(String wheel) {
            this.wheel = wheel;
            return this;
        }
        public CarBuilder withGearType(String gearType) {
            this.gearType = gearType;
            return this;
        }
        public Car build() {
            return new Car(this);
        }
    }
}



