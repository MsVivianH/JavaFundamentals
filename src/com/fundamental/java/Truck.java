package com.fundamental.java;

// The is our Lesson11 lab

public class Truck {

    private String wheels;
    private int windows;
    private String boxbed;
    private String color;

    public void drive() {
        System.out.println("truck is driving");
    }

    public void setwheels(String wheels) {
        this.wheels = wheels;
    }

    public void setwindows(int windows) {
        this.windows = windows;
    }

    public void setboxbed(String boxbed) {
        this.boxbed = boxbed;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    public String getWheels() {
        return wheels;
    }
    public int getwindows() {
        return windows;
    }
    public  String getBoxbed() {
        return boxbed;
    }
    public  String getColor() {
        return color;
    }

public Truck() {
        System.out.println("This is the default constructor");
}

public Truck(String wheels, int windows, String boxbed, String color) {
        this.wheels = wheels;
        this.windows = windows;
        this.boxbed = boxbed;
        this.color = color;
}

public Truck(String wheels, int windows) {
        this(wheels, windows, "flatbed", "Cameo");
}

}