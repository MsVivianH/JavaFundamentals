package com.fundamental.java;

import com.fundamental.lesson10.Lesson10;

/*
 * This class is the starting class of this project
 * This is an example of a multi-line comment.
 * */
public class Main {

    public static void main(String[] args) {
        lesson9Example();
        //beerSong();
        //lesson18Example();
        //lesson17Example();
        //week3Lab3();
        //lesson16Example();
        //lesson15Example();
        //lesson12Example();
        //TruckExample();
        //lesson11Example();
        //lesson10Example();
        //lesson8Example2();
        //lesson8Example1();
        //lesson7examples();
        //moreLesson6();
        //lesson6Examples();
        //lesson5Examples();
        //houseExample();
    } // end of main method

    public  static  void  lesson9Example() {
        Lesson9 myLesson9 = new Lesson9();
        myLesson9.basicIntArray();
    }

    public static void beerSong() {
        BottlesOfBeerSong song = new BottlesOfBeerSong();
        song.timeToSing();
    }

    public static void lesson18Example() {
        Lesson18 myLesson18 = new Lesson18();
        myLesson18.exampleException();
        myLesson18.myArrayException();
    }

    public static void lesson17Example() {
        Lesson17 myLesson17 = new Lesson17();
        //myLesson17.exampleArrayList1();
        //myLesson17.exampleArrayList2();
        //myLesson17.exampleHashSet();
        myLesson17.examplHashMap();
    }

    public static void lesson16Example() {
        Lesson16 myLesson16 = new Lesson16();
        myLesson16.showEnum();
        myLesson16.MyFavoriteFlavor(Lesson16.IceCreamFlavors.CHOCOLATE);

        DaysOfTheWeek d1[] = DaysOfTheWeek.values();
        for (DaysOfTheWeek day : d1) {
            System.out.println(day + " at index " + day.ordinal());
        }

    }

    public static void lesson15Example() {
        int[] myKeys = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Blackberry myBlackberry = new Blackberry(25, myKeys, 0, "Color Screen");
        myBlackberry.receiveCall();
        AbstractCellPhone myOldPhone = new Blackberry(30, myKeys, 1, "monochrome");
        myOldPhone.receiveCall();
        myOldPhone.endCall();
    } // end method

    public static void week3Lab3() {
        Week3Lab Lab3 = new Week3Lab();
        System.out.println(Lab3.showGrade('G'));
    }

    public static void lesson12Example() {
        Condo myCondo = new Condo();
        myCondo.doorOpenClose();
    }

    public static void TruckExample() {
        Truck myTruck = new Truck("silver spokes", 22, "flatbed", "camo");
        System.out.println(myTruck.getWheels());
    }

    public static void lesson11Example() {
        House house1 = new House();

        House house2 = new House("red");
    }

    public static void lesson10Example() {
        //Try to see a private method in another class
        Lesson6 myLesson6 = new Lesson6();
        //myLesson6.examplePrivate(); // cannot access
        Lesson10 myLesson10 = new Lesson10();
        //myLesson10.showLesson(); // cannot access
        //myLesson10.showProtected(); // cannot access
    }

    public static void lesson8Example2() {
        Lesson8 otherLesson = new Lesson8();
        otherLesson.basicWhileExample();
        otherLesson.basicDoWhileExample();
        otherLesson.basicForLoopExample();
        otherLesson.basicBranchingExample();
    }

    public static void lesson8Example1() {
        Lesson8 myLesson8 = new Lesson8();
        myLesson8.basicIfExample(5, 10); // prints before & after
        myLesson8.basicIfExample(5, 5); // prints before if & after
        myLesson8.basicIfElseExample(10, 12); // not equal
        myLesson8.basicIfElseExample(12, 12); // equal
        myLesson8.basicIfElseChainExample(42);
        myLesson8.basicIfAndOrExample(36);
        myLesson8.basicSwtichExample(3);
    }

    public static void lesson7examples() {
        Lesson7 myLesson7 = new Lesson7();
        myLesson7.basicMath();
        myLesson7.exampleModulus();
        //myLesson7.addTwoNumbers();
        myLesson7.exampleAssignment1();
        myLesson7.exampleAssignment2();
        myLesson7.exampleRelational();
        myLesson7.exampleIncrement();
    }

    public static void moreLesson6() {
        Lesson6 myOtherLesson = new Lesson6();
        myOtherLesson.exampleBuilder("Chicken", 2);
        myOtherLesson.exampleChar();
        myOtherLesson.exampleEscape();
    }

    public static void lesson6Examples() {
        Lesson6 myLesson6 = new Lesson6();
        myLesson6.exampleCharAt();
        myLesson6.exampleConcat(" has awesome donuts");
        myLesson6.exampleEquals("LaMars");
        String myLower = myLesson6.exampleLowercase();
        System.out.println(myLower);
        String myUpper = myLesson6.exampleUppercase();
        System.out.println(myUpper);
        myLesson6.exampleLength();
    }

    public static void lesson5Examples() {
        Lesson5 myLesson5 = new Lesson5();
        myLesson5.showLocalExample();
        myLesson5.showLocalWithParameter(10, 12);
        int example = myLesson5.showLocalWithReturn(15, 8);
        System.out.println(example);
        myLesson5.showInstanceVariable();
        myLesson5.showConversions();
    }

    public static void houseExample() {
        System.out.println("Welcome to Java");
        House myHouse = new House();
        myHouse.doorOpenClose();
    }
}
