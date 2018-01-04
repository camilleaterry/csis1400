/*Camille Terry
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2findingtheminandmax;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author camilleterry
 */
public class Assignment2FindingTheMinAndMax
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        List<Double> listOne = new ArrayList<Double>();
        
        while (true) 
        {
            JTextField userNumberFeild = new JTextField();
            int getNumber = JOptionPane.showConfirmDialog(
                    null,
                    new Object[] { "Please input your number here: ", userNumberFeild , "Would you like to input another number?" } ,
                    "Finding the Min and Max",
                    JOptionPane.YES_NO_OPTION
                    );
            
            // we have the number they just entered, add it to the list
            if (getNumber == JOptionPane.YES_NO_OPTION)
            {
                listOne.add(Double.parseDouble(userNumberFeild.getText()));     
                JOptionPane.showMessageDialog(null, " Please input another number: " );
            }
            else
            {
                listOne.add(Double.parseDouble(userNumberFeild.getText()));
                // get the min/max
                Double min = Collections.min(listOne);
                Double max = Collections.max(listOne);
                // print them out
                JOptionPane.showMessageDialog(null," Here is the max and min of the numbers you have provided: \n " + max +" " + min);
                System.exit(0);
            }
        }
    }
}
    
