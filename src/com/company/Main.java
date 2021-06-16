package com.company;

public class Main {

    public static void main(String[] args) {

        String s1 = "This is exercise 1"; // length of all names must be longer than 1 and should be longer than 2. For example excerciseLowerCase or just lowerCaseEx
        String s2 = "This is Exercise 1";
        String s3 = "This is not Exercise 1";
        boolean flag;       //  better to name variables by meaning. For example, boolean areCaseInsensitiveEqual or areTotallyEqual or just areEqual

        flag = s1.equalsIgnoreCase(s2);
        System.out.println("Is s1 equal to s2 ? Its " + flag); // you can optimize and avoid creating of excess variable

        flag = s1.equalsIgnoreCase(s3);
        System.out.println("Is s1 equal to s2 ? Its " + flag); // you have a bug here

    }
}
