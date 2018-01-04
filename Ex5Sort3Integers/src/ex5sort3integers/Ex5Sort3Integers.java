/* Camille Terry
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5sort3integers;

import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author camilleterry
 */
public class Ex5Sort3Integers 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        JTextField num1Field = new JTextField();
        JTextField num2Field = new JTextField();
        JTextField num3Field = new JTextField();
        
        JOptionPane.showConfirmDialog(
                null,
                new Object[] { "Number 1 ", num1Field, "Number 2 ", num2Field, "Number 3 ", num3Field } ,
                "Sorting intergers",
                JOptionPane.OK_CANCEL_OPTION
               );
 
        int num1 = Integer.parseInt(num1Field.getText());
        int num2 = Integer.parseInt(num2Field.getText());
        int num3 = Integer.parseInt(num3Field.getText());
        
        int[] sortingList = { num1, num2, num3 };

        Arrays.sort(sortingList);
        
        JOptionPane.showMessageDialog(null, Arrays.toString(sortingList));         
    }    
}
