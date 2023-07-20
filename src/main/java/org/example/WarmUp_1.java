package org.example;

public class WarmUp_1 {

    public static void main(String[] args) {



    }
    public boolean sleepIn(boolean weekday, boolean vacation) {
        // The parameter weekday is true if it is a weekday, and the parameter vacation is true if
        // we are on vacation.
        // We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
        //sleepIn(false, false) → true
        // sleepIn(true, false) → false
        //  sleepIn(false, true) → true

        return !weekday || vacation;

    }
    public int diff21(int n) {
        //Given an int n, return the absolute difference between n and 21,
        // except return double the absolute difference if n is over 21.
        //
        //
        //diff21(19) → 2
        //diff21(10) → 11
        //diff21(21) → 0

        if(21-n>=0){
            return 21-n;
        }else{
            return (n-21)*2;
        }
    }
    public boolean nearHundred(int n) {
    //Given an int n, return true if it is within 10 of 100 or 200.
        // Note: Math.abs(num) computes the absolute value of a number.
//
//nearHundred(93) → true
//nearHundred(90) → true
//nearHundred(89) → false

        if((n>=90 && n<=110) || (n>=190 && n<=210)){
            return true;
        }else return false;

    }

    public String missingChar(String str, int n) {
        //Given a non-empty string and an int n, return a new string where the char at index n has been removed.
        // The value of n will be a valid index of a char in the original string
        // (i.e. n will be in the range 0..str.length()-1 inclusive).
        //
        //
        //missingChar("kitten", 1) → "ktten"
        //missingChar("kitten", 0) → "itten"
        //missingChar("kitten", 4) → "kittn"

        return str.substring(0,n) + str.substring(n+1);
    }



}
