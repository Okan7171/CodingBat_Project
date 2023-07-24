package org.example;

public class String_1 {
    public static void main(String[] args) {

    }
    public String helloName(String name) {
        //Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
        //
        //
        //helloName("Bob") → "Hello Bob!"
        //helloName("Alice") → "Hello Alice!"
        //helloName("X") → "Hello X!"

        return "Hello "+ name +"!";

    }
    public String makeOutWord(String out, String word) {
    //Given an "out" string length 4, such as "<<>>", and a word, return a new string where the
        // word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j)
        // to extract the String starting at index i and going up to but not including index j.
        //
        //
        //makeOutWord("<<>>", "Yay") → "<<Yay>>"
        //makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
        //makeOutWord("[[]]", "word") → "[[word]]"

        return out.substring(0, 2)+ word + out.substring(2);

    }
    public String firstHalf(String str) {
    //Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
        //
        //
        //firstHalf("WooHoo") → "Woo"
        //firstHalf("HelloThere") → "Hello"
        //firstHalf("abcdef") → "abc"

        return str.substring(0,str.length()/2);
    }
    public String nonStart(String a, String b) {
        //Given 2 strings, return their concatenation, except omit the first char of each.
        // The strings will be at least length 1.
        //
        //
        //nonStart("Hello", "There") → "ellohere"
        //nonStart("java", "code") → "avaode"
        //nonStart("shotl", "java") → "hotlava"

        return a.substring(1)+ b.substring(1);
    }



}
