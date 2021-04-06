package com.company;

// Program computes income tax according to set schedule

import java.util.Scanner;

public class IncomeTax {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter yearly income.");
        double income = keyboard.nextDouble();

        double incomeTax;

        if (income <= 50000) {
            incomeTax = income * 0.01;
        } else if (income > 50000 && income <= 75000) {
            incomeTax = (50000 * 0.01) + ((income - 50000) * 0.02);
        } else if (income > 75000 && income <=  100000) {
            incomeTax = (50000 * 0.01) + (25000 * 0.02) + ((income - 75000) * 0.03);
        } else if (income > 100000 && income <= 250000) {
            incomeTax = (50000 * 0.01) + (25000 * 0.02) + (25000 * 0.03) + ((income - 100000) * 0.04);
        } else if (income > 250000 && income <- 500000) {
            incomeTax = (50000 * 0.01) + (25000 * 0.02) + (25000 * 0.03) + (150000 * 0.04) +
                    ((income - 250000) * 0.05);
        } else {
            incomeTax = (50000 * 0.01) + (25000 * 0.02) + (25000 * 0.03) + (150000 * 0.04) + (100000 * 0.05) +
                    ((income - 500000) * 0.06);
        }

        System.out.printf("Your income tax is $%5.2f.", incomeTax);

    }

}
