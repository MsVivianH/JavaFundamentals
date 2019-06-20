package com.fundamental.java;

import java.util.Scanner;

/*
 * The content of the class goes over the Lesson 7 content Java Operators
 * */
public class Lesson7 {

    int value1 = 23, value2 = 45;
/*
* Arithmetic operators are used in mathematical expressions
* the same way they are used in algebra.
* */
    public void basicMath() {
        int addTotal = value1 + value2;
        int subtractTotal = value2 - value1;
        int multiplyTotal = value1 * value2;
        int divisionTotal = value1 / value2;
        System.out.println(addTotal);
        System.out.println(subtractTotal);
        System.out.println(multiplyTotal);
        System.out.println(divisionTotal);
    }

    public void exampleModulus() {
        int modulusTotal = value1 % value2;
        System.out.println(modulusTotal);
    }

    public void addTwoNumbers() {
        int x, y, z;
        System.out.println("Enter two integers to calculate their sum.");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = x + y;
        System.out.println("The Sum of entered values = " + z);
    }

// Algebraic signs plus the = sign
    public void exampleAssignment1() {
        int able = 10, may = 15;
        able += may;
        System.out.println(able);
        may -= able;
        System.out.println(may);
        able *= may;
        System.out.println(able);
        able /= may;
        System.out.println(able);
        may %= able;
        System.out.println(may);
    }

    public void exampleAssignment2() {
        int beta = 10, charlie = 5;
        beta <<= charlie;
        System.out.println(beta);
        charlie >>= beta;
        System.out.println(charlie);
        beta &= charlie;
        System.out.println(beta);
        charlie ^= beta;
        System.out.println(charlie);
    }

    // Used to check relationships between two variables
    public void exampleRelational() {
        int echo = 25, foxtrot = 30, golf = 25;
        boolean isSample1 = echo == foxtrot;
        System.out.println(isSample1);
        boolean isSample2 = echo != foxtrot;
        System.out.println(isSample2);
        boolean isActual = foxtrot > golf;
        System.out.println(isActual);
        boolean isActual2 = foxtrot < golf;
        System.out.println(isActual2);
        boolean isFamiliar = echo >= golf;
        System.out.println(isFamiliar);
        boolean isFamiliar2 = foxtrot <= echo;
        System.out.println(isFamiliar2);
    }

    // Used to increase the value by 1
    public void exampleIncrement() {
        int home = 10, jump, car;
        jump = home++;
        System.out.println(jump); // answer is 10

        car = ++home;
        System.out.println(car); // answer is 12
    }

    // Used to decrease the value by 1
    public void exampleDecrement() {
        int toy = 10, joe, jerry;
        joe = toy--;
        System.out.println(joe);

        jerry = --toy;
        System.out.println(jerry);
    }

}
