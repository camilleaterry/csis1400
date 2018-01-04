/*Camille Terry
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1theadditiongame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author camilleterry
 */
public class Assignment1TheAdditionGame {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        //Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("How many addition problems would you like to attempt? ");

        int numProblems = input.nextInt();
        int totalCorrect = 0;
        for (int i = 0; i < numProblems; i++)
        {
            Random rNumber = new Random();
            int firstNumber = rNumber.nextInt(100) + 1;
            int secondNumber = rNumber.nextInt(100) + 1;

            System.out.println("Add these two numbers: " + firstNumber + "+" + secondNumber + " = ");
            int usersGuess = input.nextInt();

            int answer = firstNumber + secondNumber;

            if (answer == usersGuess) {
                System.out.println("correct!");
                System.out.println("You got " + (totalCorrect = totalCorrect + 1) + " out of " + numProblems + " correct");
            } else {
                System.out.println("Sorry, you are wrong. better luck next time.");
                System.out.println("The correct answer is:  " + answer );
            }

        }
    }

}
