package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        Character char1 = str.toUpperCase().charAt(0);
        return char1 + str.substring(1);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String strRet = "";
        for (int i = str.length()-1; i >= 0; i--)
            strRet += str.charAt(i);

        return strRet;

    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
       // Character charLast = str.charAt(str.length() - 1);
        String str1 = reverse(str);
        return camelCase(str1);
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        return str.substring(1, str.length() - 1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        String tempStr = "";
        for (int j = 0; j < str.length(); j++) {
            Character charCurrent = str.charAt(j);
            if (Character.isLowerCase(charCurrent)) {
                tempStr += (Character.toUpperCase(charCurrent));
            } else {
                tempStr += (Character.toLowerCase(charCurrent));
            }
        }
        return tempStr;

    }
}
