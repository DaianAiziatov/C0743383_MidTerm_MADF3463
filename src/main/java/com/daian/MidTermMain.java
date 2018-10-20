package com.daian;

public class MidTermMain {

    public static void main(String[] args) {
        LambtonStringTools lambtonStringTools = new LambtonStringTools();

        System.out.println("REVERSE METHOD");
        String input1 = "Daian Aiziatov";
        System.out.println("Input: " + input1 + "\nOutput: " + lambtonStringTools.reverse(input1));

        System.out.println("\nBINARY TO DECIMAL METHOD");
        String input2 = "11111";
        String input3 = "11111.2";
        System.out.println("Input: " + input2 + "\nOutput: " + lambtonStringTools.binaryToDecimal(input2));
        System.out.println("Input: " + input3 + "\nOutput: " + lambtonStringTools.binaryToDecimal(input3));

        System.out.println("\nINITIALS METHOD");
        String input4 = "jean luc picard";
        String input5 = "James tiBeriUs kiRK";
        System.out.println("Input: " + input4 + "\nOutput: " + lambtonStringTools.initials(input4));
        System.out.println("Input: " + input5 + "\nOutput: " + lambtonStringTools.initials(input5));

        System.out.println("\nMOST FREQUENT");
        String input6 = "sajdaksbdbs";
        System.out.println("Input: " + input6 + "\nOutput: " + lambtonStringTools.mostFrequent(input6));


        System.out.println("\nREPLACE SUB STRING");
        String input7 = "the dog jumped over the fence";
        System.out.println("Input: " + input7 + "\nOutput: " + lambtonStringTools.replaceSubString(input7, "the", "that"));
    }

}
