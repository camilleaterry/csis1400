/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6thefractionclass;

import java.math.BigInteger;

/**
 *
 * @author camilleterry
 */
public class Fraction {

    int num = 0;
    int dom = 0;

    public String toString() {
        return "(" + num + "/" + dom + ")";
    }

    public double getDecimal() {

        return (double) num / (double) dom;
    }

    public void reduce() {
        BigInteger numerator = BigInteger.valueOf(num);
        int gcd = numerator.gcd(BigInteger.valueOf(dom)).intValue();

        this.dom /= gcd;
        this.num /= gcd;

    }

    public String toMixed() {

        int x = this.num / this.dom;
        int y = this.num % this.dom;
        int z = this.dom;
        
        Fraction two = new Fraction(y,z);
        two.reduce();
        
        return " " + x +  " " + two.toString();
    }

    public Fraction(int n, int d) {
        num = n;
        dom = d;
    }
    
    public Fraction(){
        num = 1;
        dom = 1;
    }
}
