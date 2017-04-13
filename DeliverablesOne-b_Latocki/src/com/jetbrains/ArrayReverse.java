
package com.jetbrains;
import java.util.Scanner;
import java.util.Arrays;

// GC Java Bootcamp prework Deliverable One from Lydia Latocki


public class ArrayReverse {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); // scanner for input
        final int NUM_VALS = 5;  // number on int user able to enter
        int[] userNum = new int[NUM_VALS]; // user integers storage
        int j = 0;
        int i = 0;

        System.out.println("Enter " + NUM_VALS + " integer values: ");
        for( i=0 ;i < NUM_VALS; i++) {
            userNum[i] = scnr.nextInt(); // capture user input int
        }
        for (j = 0; j < NUM_VALS; j++) {
            System.out.print("You entered: ");
            System.out.println(userNum[j]);

        }
        System.out.print("\nNumbers in reverse: "); // statement to Print reversed array
        for (j = NUM_VALS - 1; j >= 0; j--) {
            System.out.print(userNum[j] + " ");
        }
    }

}





