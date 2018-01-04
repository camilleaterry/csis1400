/*Camille Terry
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4computingtaxes;

import java.util.Scanner;

/**
 *
 * @author camilleterry
 */
public class Ex4ComputingTaxes 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Creat a Scanner
        Scanner input =  new Scanner(System.in);
        
        //promp the user to enter filing status
        System.out.print(
            "(0-single filer, 1-married jointly or qualifying widow(er),"
                + "\n2-married separately, 3-head of household)\n" +
                    "Enter the filing status:");
        int status = input.nextInt();
        
        //prompt the user to enter taxable income
        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();
        
        //compute tax
        double tax = 0;
        
        if (status == 0) { //Compute tax for single filers
            if (income <= 8350)
                tax = income * 0.10;
            else if (income <= 33950)
                tax = 8350 * 0.10 + (income - 8350)*0.15;
            else if (income <= 82250)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                  (income - 33950)* 0.25;
            else if (income <= 171550)
                tax = 8350 * 0.10 + (33950 - 8350)*0.15 +
                 (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
            else if (income <= 372950)
                tax = 8350 * 0.10 + (33950 - 8350)*0.15 +
                (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                (income - 171550) * 0.33;
            else        
                tax = 8350 * 0.10 + (33950 - 8350)*0.15 +        
                (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
        }  
       else if (status == 1) { 
        //compute tax for married file joint or qualifying window(er)
        if (income <= 16700)
            tax = income * 0.10;
        else if (income <= 67900)
            tax = 16700 * 0.10 + (income - 16700)*0.15;
        else if (income <= 137050)
            tax = 16700 * 0.10 + (67900 - 16700)*0.15;
        else if (income <= 208850)
            tax = 16700 * 0.10 + (67900 - 16700)*0.15;
        else if (income <= 372950)
            tax = 16700 * 0.10 + (67900 - 16700)*0.15+
            (16700 - 67900) * 0.25 + (208850 - 16700) * 0.28 + 
            (income - 208850) * 0.33;  
        else
            tax = 16700 * 0.10 + (67900 - 8350)*0.15 +
            (16700 - 67900) * 0.25 + (372950 - 16700) * 0.28 +
            (372950 - 208850) * 0.33 + (income - 372950) * 0.35;        
       }
       else if (status == 2) { // Compute tax for married separatel
            if(income <= 8350)
                tax = income * 0.10;
            else if (income <= 33950)
                tax = 8350 * 0.10 + (income - 8350)*0.15;
            else if (income <= 68525)
                tax = 8350 * 0.10 + (33950 - 8350)*0.15;
            else if (income <= 104425)
                tax = 8350 * 0.10 + (33950 - 8350)*0.15;
            else if (income <= 186475)
                tax = 8350 * 0.10 + (33950 - 8350)*0.15 +
                (82250 - 33950) * 0.25 + (104425 - 68525) * 0.28 +
                (income - 104425) * 0.33;
            else        
                tax = 8350 * 0.10 + (33950 - 8350)*0.15 +        
                (82250 - 33950) * 0.25 + (104425 - 82250) * 0.28 +
                (186475 - 104425) * 0.33 + (income - 186475) * 0.35;
            
       }
       else if (status == 3) {//Compute tax for head of household
            if(income <= 11950)
                tax = income * 0.10;
            else if (income <= 45500)
                tax = 11950 * 0.10 + (45500 - 11950) *0.15;
            else if (income <= 117450)
                tax = 11950 * 0.10 + (45500 - 11950) *0.15;
            else if (income <= 190200)
                tax = 11950 * 0.10 + (45500 - 11950) *0.15;
            else if (income <= 372950)
                tax = 11950 * 0.10 + (45500 - 11950) *0.15 +
                (11950 - 45500) * 0.25 + (190200 - 117450) * 0.28 +
                (income - 190200) * 0.33;
            else        
                tax = 11950 * 0.10 + (45500 - 11950) *0.15 +        
                (11950 - 45500) * 0.25 + (190200 - 11950) * 0.28 +
                (372950 - 190200) * 0.33 + (income - 372950) * 0.35;
       }
       else {
           System.out.println("Error: invalid status");
           System.exit(1);
       }
        //Display the result
        System.out.println("Tax is " + (int)(tax * 100)/100.0);
    }
    // for status 0, I used 0, and 400000 for the input to make sure my program ran correctly
    // for status 1, I used 1, and 400000 for the input to make sure my program ran correctly 
    // for status 2, I used 2, and 400000 for the input to make sure my program ran correctly
    // for status 3, I used 3, and 400000 for the input to make sure my program ran correctly 
}
        
