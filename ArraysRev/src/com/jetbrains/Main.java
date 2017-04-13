package com.jetbrains;
import java.util.Scanner;

// GC Java Bootcamp prework-Rework Deliverable One from Lydia Latocki

    public class Main {

        public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in); // scanner for input
            final int NUM_VALS = 5;  // number on int user able to enter
            int[] inputArray = new int[NUM_VALS]; // user integers storage
            int i = 0;
            int j = 0;
            int temp;

            System.out.println("Enter " + NUM_VALS + " integer values, each on a new line: ");

            for(i = 0; i < NUM_VALS; i++) {
                inputArray[i] = scnr.nextInt();// capture user input int
            }

            j = i-1;
            i = 0;

            while (i < j){
                temp = inputArray[i];
                inputArray[i] = inputArray[j];
                inputArray[j] = temp;
                i++;
                j--;
            }

            System.out.println("\nYour numbers in reverse are: "); // statement to Print reversed array
                for (i=0; i< NUM_VALS; i++){
                    System.out.print(inputArray[i] + " ");
                }

            System.out.println("\nSuccess! Goodbye.");
        }

        }







