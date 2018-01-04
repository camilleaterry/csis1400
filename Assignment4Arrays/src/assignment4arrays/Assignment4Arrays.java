/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author camilleterry
 */
public class Assignment4Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //scanner
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter? ");
        int manyNumber = input.nextInt();

        int[] sortingList = new int[manyNumber];

        for (int i = 0; i < manyNumber; i++) {

            System.out.println("Please enter each number: ");
            int eachNumber = input.nextInt();

            sortingList[i] = eachNumber;

        }

        Collections.reverse(Arrays.asList(sortingList));

        System.out.print("The numbers you entered: ");

        for (int i = 0; i < manyNumber; i++) {
            System.out.print(sortingList[i] + "  ");

        }

    }

}
