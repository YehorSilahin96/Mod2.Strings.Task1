package com.company;

public class Main {

    public static void main(String[] args) {

        String str1 = "This is exercise 1";
        String str2 = "This is Exercise 1";
        String str3 = "THIS IS EXERCISE 1";

        //equal of strings
        boolean lowerCaseEx1 = str1.equalsIgnoreCase(str2);
        System.out.println("Is s1 equal to s2 ? Its " + lowerCaseEx1); // optimizing and renaming

        boolean lowerCaseEx2 = str1.equalsIgnoreCase(str3);
        System.out.println("Is s1 equal to s2 ? Its " + lowerCaseEx2); // fixing bag

    }
}
