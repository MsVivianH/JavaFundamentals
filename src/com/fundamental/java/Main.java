package com.fundamental.java;
import com.fundamental.lesson10.Lesson10;
/*
 * This class is the starting class of this project
 * This is an example of a multi-line comment.
 * */
public class Main {

    public static void main(String[] args) {
        lesson11Example();
        //lesson10Example();
        //lesson8Example2();
        //lesson8Example1();
        //lesson7examples();
        //moreLesson6();
        //lesson6Examples();
        //lesson5Examples();
        //houseExample();
    } // end of main method

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
