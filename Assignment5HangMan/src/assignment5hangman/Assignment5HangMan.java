/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5hangman;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author camilleterry
 */
public class Assignment5HangMan {

    /**
     * @param args the command line argumentsj
     * jjjjjjjj
     * 
     */
    public static boolean winLoose(boolean[] spaces) {

        boolean uWon = true;
        for (int i = 0; i < spaces.length; i++) {
            if (spaces[i] == false) {
                uWon = false;
            }
        }
        if (uWon == true) {
            return true;
        } else {
            return false;
        }
    }

    public static void guesses(char[] word, boolean[] spaces) {
        for (int i = 0; i < word.length; i++) {

            System.out.print((spaces[i] == true ? " " + word[i] + " " : " _ "));

        }
    }

    public static void gallows(int guesses) {

        System.out.println("-------");
        System.out.println("|     |");
        System.out.println("|     " + (guesses > 0 ? "O" : " "));
        System.out.printf("|    %s%s%s\n", (guesses > 2 ? "/" : " "), (guesses > 1 ? "|" : " "), (guesses > 3 ? "\\" : " "));
        System.out.println("|     " + (guesses > 4 ? "|" : " "));
        System.out.printf("|    %s%s\n", (guesses > 5 ? "/ " : " "), (guesses > 6 ? "\\" : " "));
        System.out.println("|        ");

    }

    public static char[] explode(String word) {
        return word.toCharArray();
    }

    public static void main(String[] args) {

        String[] words = {"javascript", "declaration", "object", "class", "failing"};

        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        gallows(0);
        
        Random ran = new Random();

        int n = ran.nextInt(5);
        String word = words[n];
        int wordLength = word.length();
        char[] wordArray = word.toCharArray();
        boolean[] spaces = new boolean[wordLength];
        int guessCounter = 0;

        Scanner input = new Scanner(System.in);
        guesses(words[n].toCharArray(), spaces);
        
        while (guessCounter < 7 && winLoose(spaces) == false) {
            gallows(guessCounter);
            String letterGuess = input.nextLine();
            boolean anyCorrect = false;

            for (int i = 0; i < wordLength; i++) {
                if (wordArray[i] == letterGuess.charAt(0)) {
                    spaces[i] = true;
                    anyCorrect = true;
                }
            }
            if (anyCorrect == false) {
                guessCounter += 1;
            }

            guesses(words[n].toCharArray(), spaces);

        }
        boolean uWon = winLoose(spaces);
        if (uWon == true) {
            System.out.println("\n You Won! ");
        } else {
            System.out.println("\n You Lost... =[ ");
        }
    }
}
