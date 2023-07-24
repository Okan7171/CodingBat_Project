package org.example;

public class String_3 {
    public static void main(String[] args) {

    }
    public int countYZ(String str) {
        //Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and
        // the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive).
        // We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately
        // following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
        //
        //
        //countYZ("fez day") → 2
        //countYZ("day fez") → 2
        //countYZ("day fyyyz") → 2

        int count=0;
        String [] str1= str.split("[^a-zA-Z]");
        for (int i = 0; i < str1.length; i++) {
            if(!str1[i].isEmpty() && str1[i].substring(str1[i].length()-1).equalsIgnoreCase("y")||str1[i].substring(str1[i].length()-1).equalsIgnoreCase("z")){
                count++;
            }
        }
        return count;
    }
    public boolean gHappy(String str) {
        //We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to
        // its left or right. Return true if all the g's in the given string are happy.
        //
        //
        //gHappy("xxggxx") → true
        //gHappy("xxgxx") → false
        //gHappy("xxggyygxx") → false

        boolean b= false;
        for (int i = 0; i < str.length(); i++) {
            if(str.substring(i, i+1).equals("g")){
                if ((i<str.length()-1 && str.substring(i+1, i+2).equals("g") )|| (i>0 && str.substring(i-1, i).equals("g"))) {
                    b=true;
                }else b=false;
            }
        }return b  || str.isEmpty();
        //return b  || !str.contains("g");
    }
    public String sameEnds(String string) {
        //Given a string, return the longest substring that appears at both the beginning and end of
        // the string without overlapping. For example, sameEnds("abXab") is "ab".
        //
        //
        //sameEnds("abXYab") → "ab"
        //sameEnds("xx") → "x"
        //sameEnds("xxx") → "x"

        String result="";
        for (int i = 0; i <=string.length()/2 ; i++) {
            if (string.endsWith(string.substring(0, i))){
                result=string.substring(0,i);
            }
        }
        return result;
    }


}
