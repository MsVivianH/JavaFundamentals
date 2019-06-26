package com.fundamental.java;

/*
 * The content of this class is for Lesson 6 Slide Deck
 * Strings & More
 * */
public class Lesson6 {

    String myString = "LaMars";

    private void examplePrivate() {
        System.out.println("This is a private method");
    }

    // Method shows String method for charAt
     void exampleCharAt() {
        char myChar = myString.charAt(2);
        System.out.println(myChar);
    }

    // Method shows String method for Concat
    public void exampleConcat(String value) {
        String happy = myString.concat(value);
        System.out.println(happy);
    }

    // Method shows String method for Equals
    public void exampleEquals(String donut) {
        boolean myBoolean = myString.equals(donut);
        System.out.println(myBoolean);
    }

    // Method shows String method for String builders Lowercase
    public String exampleLowercase() {
        return myString.toLowerCase();
    }

    // Method shows String method for String builders Uppercase
    public String exampleUppercase() {
        return myString.toUpperCase();
    }

    //Method shows String method for the length of a string
    public void exampleLength() {
        int length = myString.length();
        System.out.println(length);
    }

    // Method shows String methods for StringBuilders
    public void exampleBuilder(String food, int value) {
        StringBuilder build = new StringBuilder();
        build.append("My favorite food is ");
        build.append(food).append(" and I ate ")
                .append(value).append(" plates of it.");
        String fav = build.toString();
        System.out.println(fav);
    }

    //Method shows String methods for Unicode Character
    public void exampleChar() {
        char c1 = 't';
        char c2 = '\u00A7';
        System.out.println(c2);
    }

    // Method shows String methods for Escape Sequences
    public void exampleEscape() {

        System.out.println("That\'s a cool toy.\tCan I\n play with it.");
    }


}