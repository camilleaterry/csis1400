/* Camille Terry
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6usingandor;

import java.util.Scanner;

/**
 *
 * @author camilleterry
 */
public class Ex6UsingAndor 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Scanner
        Scanner input =  new Scanner(System.in);
        System.out.print("Please pick a number: ");
        
        int number = input.nextInt();
        
        if (number % 5 == 0 && number % 6 == 0)
           System.out.println("This is divisible by 5 and 6: " + number);
        else
           System.out.println("This is not divisible by 5 and 6: " + number);
        
        if (number % 5 == 0 || number % 6 == 0)
           System.out.println("This is not divisible by 5 or 6: " + number);
        else
           System.out.println("This is divisible by 5 or 6: " + number); 
        
        if (number % 5 == 0 ^ number % 6 == 0)
            System.out.println("This is divisible by 5 or 6, but not by both: " + number); 
      
    }
    
}
