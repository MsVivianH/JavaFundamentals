package com.fundamental.java;

public class SUV extends Truck {

    private String automaticDoor;

    public SUV() {
        System.out.println("Default SUV constructor");
    }

    public SUV(String automaticDoor) {
        this.setAutomaticDoor(automaticDoor);
    }

public void openDoorClose() {
        System.out.println("hands free open and close");
}

    public String getAutomaticDoor() {
        return automaticDoor;
    }

    public void setAutomaticDoor(String automaticDoor) {
        this.automaticDoor = automaticDoor;
    }
}
