package com.company;

//Program takes hourly wage and hours worked by employee to calculate paycheck.

import java.util.Scanner;

public class Paycheck {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter in hourly wage.");
        double wage = keyboard.nextDouble();

        System.out.println("Enter in hours worked the past week.");
        int hours = keyboard.nextInt();

        double pay;

        if (hours <= 40) {
            pay = hours * wage;
        } else {
            pay = ((hours - 40) * 1.5 * wage) + (wage * 40);
        }

        System.out.printf("Paycheck = $%5.2f", pay);

    }

}
