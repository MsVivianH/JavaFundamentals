package com.fundamental.java;

/*
 *The content of the class is foe Lesson 9
 * Arrays
 * */
public class Lesson9 {
    public void basicIntArray() {
        int[] intArray = {23, 45, 12, 8, 95, 103, 37};
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        } // end for loop
    } // end method

    public void basicStringArray() {
        String[] stringArray = new String[4];
        stringArray[0] = "happy";
        stringArray[1] = "tuesday";
        stringArray[2] = "movie";
        stringArray[3] = "grape";

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        } // end for loop
    } //end method

    public void basicTwoDimentionalArray() {
        int[][] myArray = {{23, 45}, {35, 46}, {57, 98}};
            for (int i = 0; i < myArray.length; i++) {
                for(int j = 0; j < myArray[i].length; j++) {
                    System.out.println(myArray[i][j]);
                } //end inner for loop
            } //end for loop
    } // end method

} // end class
