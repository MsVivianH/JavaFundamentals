package com.fundamental.java;

/*
 * This class servers as a child to AbstractCellPhone
 * */
public class Blackberry extends AbstractCellPhone {

    public Blackberry(int vol, int[] nKeys, int sKey, String screen) {
        super(vol, nKeys, sKey, screen);
    }


    @Override
    public void receiveCall() {
        System.out.println("Receiving Phone Call");
    }

    @Override
    public void sendCall() {
        System.out.println("Sending Phone Call");
    }

    @Override
    public void endCall() {
        System.out.println("Call has ended");
    }

}
