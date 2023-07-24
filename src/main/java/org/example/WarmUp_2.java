package org.example;

public class WarmUp_2 {
    public static void main(String[] args) {

    }
    public String stringTimes(String str, int n) {
        //Given a string and a non-negative int n, return a larger string that is n copies of the original string.
        //
        //
        //stringTimes("Hi", 2) → "HiHi"
        //stringTimes("Hi", 3) → "HiHiHi"
        //stringTimes("Hi", 1) → "Hi"

        String result="";
        for (int i = 0; i < n; i++) {
            result+= str;

        }
        return result;
    }

    boolean doubleX(String str) {
        //Given a string, return true if the first instance of "x" in the string is immediately followed by
        // another "x".
        //
        //
        //doubleX("axxbb") → true
        //doubleX("axaxax") → false
        //doubleX("xxxxx") → true

        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i, i+1).equals("x")){
                if (str.substring(i+1, i+2).equals("x")){
                    return true;
                }return false;
            }
        }return false;
    }

    public int last2(String str) {
    //Given a string, return the count of the number of times that a substring length 2 appears in the string
        // and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
        //
        //
        //last2("hixxhi") → 1
        //last2("xaxxaxaxx") → 1
        //last2("axxxaaxx") → 2

        int count=0;
        for (int i = 0; i < str.length()-2; i++) {
            if (str.substring(i, i+2).equals(str.substring(str.length()-2))){
                count++;
            }
        }return count;
    }

}
