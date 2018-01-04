/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3trianglemethods;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

/*
 * @author camilleterry
 */
public class myTriangle {

    public static boolean isValid(double sidea, double sideb, double sidec) {

        if (sidea > sideb && sideb > sidec) {
            return (sidec + sideb > sidea);
        } else if (sideb > sidea && sidea > sidec) {
            return (sidec + sidea > sideb);
        } else if (sidec > sideb && sideb > sidea) {
            return (sidea + sideb > sidec);
        } else if (sidea > sidec && sidec > sideb) {
            return (sideb + sidec > sidea);
        } else if (sideb > sidec && sidec > sidea) {
            return (sidea + sidec > sideb);
        } else {
            return (sideb + sidea > sidec);
        }
    }

    public static double area(double sidea, double sideb, double sidec) {

        double s = (sidea + sideb + sidec) / 2;
        double area = Math.sqrt(s * (s - sidea) * (s - sideb) * (s - sidec));

        return area;

    }

    public static String triangletType(double a, double b, double c) {
        
        boolean validTriangle = isValid(a, b, c);
        
        List<Double> arr = new ArrayList<Double>();

        arr.add(a);
        arr.add(c);
        arr.add(b);

        Collections.sort(arr);

        a = arr.get(0);
        b = arr.get(1);
        c = arr.get(2);

        if (a == c) {
            return "equilateral";
        } else if (a == b || b == c) {
            return "Isosceles";
        } else if (!validTriangle){
                return "not a valid Triangle";
        } else {
            return "Scalene";
        }
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 
        
        System.out.println("What is side A?:" );
        double sidea = input.nextDouble();
        
        System.out.println("What is side B?:" );
        double sideb = input.nextDouble();
        
        System.out.println("What is side C?:" );
        double sidec = input.nextDouble();
        
        String trianglesType = triangletType(sidea, sideb, sidec);
        
        System.out.println("Your triangel is type: " + trianglesType);
        
        double triangleArea = area(sidea, sideb, sidec);
        
        System.out.println("The area of your triiangle is: " + triangleArea);
    }

}
