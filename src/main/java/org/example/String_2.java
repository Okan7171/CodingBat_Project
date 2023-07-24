package org.example;

public class String_2 {
    public static void main(String[] args) {

    }

    public String doubleChar(String str) {
    //Given a string, return a string where for every char in the original, there are two chars.
        //
        //
        //doubleChar("The") → "TThhee"
        //doubleChar("AAbb") → "AAAAbbbb"
        //doubleChar("Hi-There") → "HHii--TThheerree"

        String s1="";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 2; j++) {
                s1+=str.substring(i, i+1);
            }

        }
        return s1;

    }
    public int countCode(String str) {
    //Return the number of times that the string "code" appears anywhere in the given string,
        // except we'll accept any letter for the 'd', so "cope" and "cooe" count.
        //
        //
        //countCode("aaacodebbb") → 1
        //countCode("codexxcode") → 2
        //countCode("cozexxcope") → 2

        int count=0;
        for (int i = 0; i <str.length()-3 ; i++) {
            if (str.substring(i, i+2).equals("co")){
                if (str.substring(i+3, i+4).equals("e")){
                    count++;
                }
            }
        }
        return count;
    }

    public boolean bobThere(String str) {
       // Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
             //   bobThere("abcbob") → true
     //   bobThere("b9b") → true
     //   bobThere("bac") → false
        //


        for (int i = 0; i < str.length()-2; i++) {
            if(str.substring(i,i+1).equals("b")){
                if(str.substring(i+2, i+3).equals("b")){
                    return true;
                }
            }
        }
        return false;
    }

}
