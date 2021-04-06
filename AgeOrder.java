package com.company;

//Program for user entering age of 3 people and decides who is the oldest and youngest person is.

import java.util.Scanner;

public class AgeOrder {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter age of first person.");
        int person1 = keyboard.nextInt();

        System.out.println("Enter age of second person.");
        int person2 = keyboard.nextInt();

        System.out.println("Enter age of third person.");
        int person3 = keyboard.nextInt();

        if (person1 > person2 && person1 > person3) {
            System.out.println("Person 1 is the oldest at " + person1);
        } else if (person2 > person1 && person2 > person3) {
            System.out.println("Person 2 is the oldest at " + person2);
        } else {
            System.out.println("Person3 is the oldest at " + person3);
        }

        if (person1 < person2 && person1 < person3) {
            System.out.println("Person 1 is the youngest at " + person1);
        } else if (person2 < person1 && person2 < person3) {
            System.out.println("Person 2 is the youngest at " + person2);
        } else {
            System.out.println("Person 3 is the youngest at " + person3);
        }

    }

}
