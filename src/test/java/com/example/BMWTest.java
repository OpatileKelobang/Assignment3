package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BMWTest extends BMW{

    private String bmwColor = "Red";
    private String bmwMake = "3 Series";
    private String bmwEngineType = "3.2i";
    private BMW bmw;

    @Before
    public void setUp() throws Exception {
        bmw = new BMW();
    }



    @Test
    public void checkVehicleSpecs()
    {
        System.out.println("The BMW is a "+ bmw.model()
                + " and has a " + bmwEngineType
                + " engine, and it is "
                + bmw.carColor() + " in colour");
    }
}