/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6thefractionclass;

import java.util.Scanner;

/**
 *
 * @author camilleterry
 */
public class Assignment6TheFractionClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Fraction[] fractions = {
            new Fraction(35, 10),
            new Fraction(34, 250),
            new Fraction(2, 4),
            new Fraction(90, 100),
            new Fraction(40, 8)
        };

        while (true) {
            System.out.println("choose one");
            System.out.println("1. Test the toString() method");
            System.out.println("2. Test the reduce() method");
            System.out.println("3. Test the toMixed() method");
            System.out.println("4. Test the getDecimal() method");
            System.out.println("5. quit");

            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    for (int i = 0; i < fractions.length; i++) {
                        System.out.println(fractions[i].toString());
                    }
                    break;
                case 2:
                    for (int i = 0; i < fractions.length; i++) {
                        fractions[i].reduce();
                        System.out.println(fractions[i]);
                    }
                    break;
                case 3:
                    for (int i = 0; i < fractions.length; i++) {
                        System.out.println(fractions[i].toMixed());
                    }
                    break;
                case 4:
                    for (int i = 0; i < fractions.length; i++) {
                        System.out.println(fractions[i].getDecimal());
                    }
                    break;
                case 5: {
                    return;
                }
            }
        }
    }
}
