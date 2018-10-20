package com.daian;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class LambtonStringTools {
    //1)
    public static String reverse(String s) {
        char[] characters = s.toCharArray(); //from String to char[]

        //reverse
        for (int i = 0; i < characters.length/2; i++) {
            char temp = characters[i];
            characters[i] = characters[(characters.length - 1) - i];
            characters[(characters.length - 1) - i] = temp;
        }
        //concat to String
        String output = "";
        for (char c: characters) {
            output += c;
        }
        return output;
    }

    //2)
    public static int binaryToDecimal(String s) {
        try {
            char[] charArray = s.toCharArray();
            int output =0;
            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] == '1' || charArray[i] == '0') {
                    if (charArray[i] == '1') {
                        output += 1 * toDegree(2, i);
                    }
                } else {
                    return -1;
                }
            }
            return output;
        }
        catch (Exception e) {
            return -1;
        }
    }

    //3)
    public static String initials(String s) {
        char[] chars = s.toUpperCase().toCharArray();
        String output = chars[0] + ". ";
        int countSpaces = 0;
        int thirdWordStart = 0;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == ' ') {
                if (countSpaces < 1) {
                    output += chars[i+1] + ". ";
                    countSpaces++;
                } else {
                    thirdWordStart = i + 1;
                    countSpaces++;
                }
                if (countSpaces >= 3) {
                    return null;
                }
            }
        }
        output += chars[thirdWordStart];
        chars = Arrays.copyOf(s.toLowerCase().toCharArray(), chars.length);
        for (int i = thirdWordStart + 1; i < chars.length; i++) {
            output += chars[i];
        }
        return output;

    }

    //4)

    public static char mostFrequent(String s) {
        char[] chars = s.toCharArray();
        int count[] = new int[chars.length];
        int len = chars.length;

        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (chars[i] == chars[j]) {
                    count[i]++;
                }
            }
        }
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                maxIndex = i;
            }
        }

        return chars[maxIndex];
    }

    //5) there was no time to do it in the different way
    public static String replaceSubString(String s1, String s2, String s3) {
        String[] text = s1.split(" ");
        String output = "";
        for (int i = 0; i < text.length; i++) {
            if (text[i].equals(s2)) {
                text[i] = s3;
            }
        }
        for (String word: text) {
            output += word + " ";
        }
        return output;
    }

    //Utils
    static int toDegree(int a, int b) {
        int output = 1;
        for (int i = 0; i < b; i++) {
            output *= a;
        }
        return output;
    }

}
