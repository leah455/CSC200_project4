package com.company;

//Program takes a year and determines if it is a leap year or not.

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a year.");
        int year = keyboard.nextInt();

        if (year < 1582) {
            System.out.println("Dates before 1582 cannot be determined.");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

    }
}
