package com.fundamental.java;

/*
 * This class is used for Lesson 16 content
 * Enumerations
 * */
public class Lesson16 {

    public enum IceCreamFlavors {VANILLA, CHOCOLATE, STRAWBERRY, ROCKY_ROAD}

    public void showEnum() {
        DaysOfTheWeek d1 = DaysOfTheWeek.TUE;
        System.out.println(d1);

        System.out.println(IceCreamFlavors.ROCKY_ROAD);

        System.out.println(DaysOfTheWeek.THU);
    } //end of method

    public void MyFavoriteFlavor(IceCreamFlavors flavors) {
        String message = "My favorite flavor is ";
        switch (flavors){
            case VANILLA:
                message += "Vanilla";
                break;
            case CHOCOLATE:
                message += "Chocolate";
                break;
            case STRAWBERRY:
                message += "Strawberry";
                break;
            case ROCKY_ROAD:
                message += "Rocky Road";
                break;
            default:
                message += "All Flavors";
                break;
        }
        System.out.println(message);
    } // end of method

} //end of class
