package com.company;

public class Main {

    public static void main(String[] args) {

        String s1 = "This is exercise 1";
        String s2 = "This is Exercise 1";
        String s3 = "This is not Exercise 1";
        boolean flag;

        flag = s1.equalsIgnoreCase(s2);
        System.out.println("Is s1 equal to s2 ? Its " + flag);

        flag = s1.equalsIgnoreCase(s3);
        System.out.println("Is s1 equal to s2 ? Its " + flag);

    }
}
