package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest extends Person{

    private Employee employee;
    private double salary = 50000;
    private double tax = 20;
    private double actualSalary;

    @Before
    public void setUp() throws Exception {
        employee= new Employee("Opatile", "35", "Developer", 50000);
    }


    @Test
    public void calculateSalary() {
        actualSalary = salary - (salary / tax);
        Assert.assertEquals(47500, 47500);
        System.out.println(employee.toString() + " earns R " + (actualSalary));
    }
}