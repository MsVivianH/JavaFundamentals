package com.fundamental.java;

public class Condo extends House {

    private String balcony;

    public Condo(){
        System.out.println("Default condo constructor");
    }

    public Condo(String balcony) {
        this.balcony = balcony;
    }

    public void maintenance() {
        System.out.println("will fix condo issues");
    }

    public String getBalcony() {
        return balcony;
    }

    public void setBalcony(String balcony) {
        this.balcony = balcony;
    }
    public void doorOpenClose() {
        System.out.println("My Condo door is open.");
    }

}
