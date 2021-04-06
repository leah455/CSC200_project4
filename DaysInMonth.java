package com.company;

//Program determines days in the user inputted month.

import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a month (1-12).");
        int month = keyboard.nextInt();

        switch (month) {

            case 1:
                System.out.println("January (1) has 31 days.");
                break;
            case 2:
                System.out.println("February (2) has 28 days or 29 days in a leap year.");
                break;
            case 3:
                System.out.println("March (3) has 31 days.");
                break;
            case 4:
                System.out.println("April (4) has 30 days.");
                break;
            case 5:
                System.out.println("May (5) has 31 days.");
                break;
            case 6:
                System.out.println("June (6) has 30 days.");
                break;
            case 7:
                System.out.println("July (7) has 31 days.");
                break;
            case 8:
                System.out.println("August (8) has 31 days.");
                break;
            case 9:
                System.out.println("September (9) has 30 days.");
                break;
            case 10:
                System.out.println("October (10) has 31 days.");
                break;
            case 11:
                System.out.println("November (11) has 30 days.");
                break;
            case 12:
                System.out.println("December (12) has 31 days.");
                break;
            default:
                System.out.println(month + " is not a valid month.");
        }
    }
}
