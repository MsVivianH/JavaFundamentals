package com.fundamental.java;
/*
*
* */
public class Week3Lab {
    public String showGrade(char grade){
        switch (grade){
            case 'E':
                return "Excellent";
            case 'V':
                return "Very Good";
            case 'G':
                return "Good";
            case 'A':
                return "Average";
            case 'F':
                return "Fail";
            default:
                return "Not a valid grade";

        }
    }
    public void divisiblyByThree() {
        for(int i = 0; i< 50; i++) {
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
