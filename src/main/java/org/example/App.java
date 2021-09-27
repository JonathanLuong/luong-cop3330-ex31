package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 28 Solution
 *  Copyright 2021 Jonathan Luong
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // Creates reader

        System.out.printf("Enter your age: ");
        int age = reader.nextInt();
        System.out.printf("Enter your resting pulse: ");
        int restingHR = reader.nextInt();

        System.out.printf("\nResting Pulse: " + restingHR + "\tAge: " + age);

        System.out.printf("\nIntensity    | Rate");
        System.out.printf("\n-------------|--------\n");

        for(int i = 55; i < 100; i += 5) {
            int targetHeartRate = (((220 - age) - restingHR) * i/100) + restingHR;
            System.out.println(i + "%" + "          | " + Math.round(targetHeartRate) + " bpm");

        }
    }
}