/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex7thelettergradecalculator;

import java.util.Scanner;

/**
 *
 * @author camilleterry
 */
public class Ex7TheLetterGradeCalculator {

    public static int max(int q1, int q2) {

        if (q1 > q2) {
            return q1;
        } else {
            return q2;
        }

    }

    public static double computeRawPercentage(int bestQuiz, int bestExam) {

        return (.4 * bestQuiz) + (.6 * bestExam);

    }
    
    public static char finalGrade(double score){
        
        if (score > 90 && score < 100) {
            return 'A';
        }
        if (score > 80 && score < 89){
            return 'B';
        }
        if (score > 70 && score < 79) {
            return 'C';
        }
        if (score > 60 && score < 69) {
            return 'D';
        }
        else {
            return 'F';
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String name;
        int q1, q2, e1, e2;
        String idNum;
        int bestQuiz, bestExam;
        double score;
        char letterGrade;

        Scanner kbd = new Scanner(System.in);

        System.out.println("Enter the student's name: ");
        name = kbd.nextLine();
        System.out.println("Enter the id number: ");
        idNum = kbd.nextLine();
        System.out.println("Enter the quiz scores: ");

        q1 = kbd.nextInt();
        q2 = kbd.nextInt();

        System.out.println("Enter the exam scores: ");
        e1 = kbd.nextInt();
        e2 = kbd.nextInt();

        bestQuiz = max(q1, q2);
        bestExam = max(e1, e2);

        score = computeRawPercentage(bestQuiz, bestExam);

        letterGrade = finalGrade(score);

        System.out.print(name + " " + idNum + " ");
        System.out.println("Final Grade: " + letterGrade);

    }

}
