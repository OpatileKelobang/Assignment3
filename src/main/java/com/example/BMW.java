package com.example;

public class BMW implements Car {

    private String bmwColor = "Red";
    private String bmwMake = "3 Series";
    private String bmwEngineType = "3.2i";

    @Override
    public String carColor() {
        return bmwColor;
    }

    @Override
    public String engineType() {
        return bmwMake;
    }

    @Override
    public String model() {
        return bmwEngineType;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "bmwColor='" + bmwColor + '\'' +
                ", bmwMake='" + bmwMake + '\'' +
                ", bmwEngineType='" + bmwEngineType + '\'' +
                '}';
    }
}
