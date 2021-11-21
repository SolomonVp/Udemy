package com.company.IO.Serialization.programmer1;

import java.io.Serializable;

public class Car implements Serializable {
    String model;
    String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "\n" +
                " " + model +
                " " + color;
    }
}
