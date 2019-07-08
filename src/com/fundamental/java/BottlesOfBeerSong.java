package com.fundamental.java;

/*
* t5his class demonstrates Control Flow using a song.
* */

public class BottlesOfBeerSong {

    void timeToSing() {
        int bottleOfBeer = 99;
        String word = "bottles", results = "";

        while (bottleOfBeer > 0) {
            if (bottleOfBeer == 1) {
                word = "bottle";
            } //end if
            System.out.println(bottleOfBeer + " "+ word +"of Beer on the wall");
            System.out.println(bottleOfBeer + " " + word +"of Beer");
            System.out.println("Take one down");
            System.out.println("Pass it around");
            bottleOfBeer--;

            if (bottleOfBeer > 0) {
                System.out.println(bottleOfBeer + " " + word + " of Beer on the wall");
            } else {
                System.out.println("No more bottles of Beer on the wall");
            } // end if/else
        } // end while
    } //end method

    } // end class
